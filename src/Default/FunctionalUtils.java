package Default;

import java.time.LocalDate;
import java.util.List;
import java.util.function.BiFunction;

public abstract class FunctionalUtils {

    static BiFunction<List<Party>,String,Long>
            HowManyPartiesWhereHostedInXCity = (parties,city)->
            parties.stream().filter(p -> p.getPlace().getAddress().getCity() == city).filter(c->c.getDate().compareTo(LocalDate.now())<0).count();


}
