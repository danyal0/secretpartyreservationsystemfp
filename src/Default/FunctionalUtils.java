package Default;

import java.time.LocalDate;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public abstract class FunctionalUtils {

    static BiFunction<List<Party>,String,Long>
            HowManyPartiesWhereHostedInXCity = (parties,city)->
            parties.stream().filter(p -> p.getPlace().getAddress().getCity() == city).filter(c->c.getDate().compareTo(LocalDate.now())<0).count();



    static BiFunction<List<Reservation>,String,List<User>>
            UsersThatHaveReservationsInFairfieldToday = (reservations,city)->
            reservations.stream().map(r->r.getParty()).filter(d->d.getDate().compareTo(LocalDate.now())==0).filter(p->p.getPlace().getAddress().getCity()==city).map(p->p.getHostUser()).collect(Collectors.toList());


}
