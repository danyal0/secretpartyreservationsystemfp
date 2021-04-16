package Default;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class FunctionalUtils {

    static BiFunction<List<Party>,String,Long>
            HowManyPartiesWhereHostedInXCity = (parties,city)->
            parties.stream().filter(p -> p.getPlace().getAddress().getCity() == city)
                    .filter(c->c.getDate().compareTo(LocalDate.now())<0).count();



    static BiFunction<List<Reservation>,String,List<User>>
            UsersThatHaveReservationsInXCityToday = (reservations,city)->
            reservations.stream().map(r->r.getParty()).filter(d->d.getDate().compareTo(LocalDate.now())==0)
                    .filter(p->p.getPlace().getAddress().getCity()==city).map(p->p.getHostUser()).collect(Collectors.toList());

    static Ternary<List<Reservation>,String,Integer,List<User>>
            UsersThatHaveReservationsInXCityTodayAndAreLessThanEighteen = (reservations,city,age)->
            UsersThatHaveReservationsInXCityToday.apply(reservations,city).stream()
                    .filter(u->Period.between(u.getDateOfBirth(), LocalDate.now()).getYears()<age).collect(Collectors.toList());
}
