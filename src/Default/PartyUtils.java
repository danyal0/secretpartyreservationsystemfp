//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Default;

import java.time.LocalDate;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public abstract class PartyUtils {
    static BiFunction<List<Party>, LocalDate, List<Party>> SortPartyByTime = (parties, eventDate) -> {
        return (List)parties.stream().filter((p) -> {
            return p.getDate().equals(eventDate);
        }).sorted((i1, i2) -> {
            return i1.getEventtime().compareTo(i2.getEventtime());
        }).collect(Collectors.toList());
    };
    static BiFunction<List<Party>, LocalDate, List<Party>> SortPartyByMonth = (parties, compareDate) -> {
        return (List)parties.stream().filter((p) -> {
            return p.getDate().getMonth().equals(compareDate.getMonth());
        }).collect(Collectors.toList());
    };

}
