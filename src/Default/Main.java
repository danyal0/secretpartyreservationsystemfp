package Default;

import java.lang.reflect.ParameterizedType;
import java.time.Clock;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("By Month:");
        PartyByMonth();
        System.out.println("Sort By Time:");
        SortPartyByTime();
        System.out.println("DressCode:");
        PartyByDressCode();
        }
    public static void PartyByMonth() {
        LocalDate compareDate=LocalDate.of(2021, 04, 21);
        List<Party> party = PartyData.getParty();
        List<Party> result=party.stream()
                .filter(p->p.getDate().getMonth().equals(compareDate.getMonth()))
                .collect(Collectors.toList());
        System.out.println(result);
    }
    public static void SortPartyByTime() {
        List<Party> party = PartyData.getParty();
        List<Party> result=party.stream()
                .filter(p->p.getEventtime().compareTo(p.getEventtime())==0)
                .collect(Collectors.toList());
        System.out.println(result);
    }
    public static void PartyByDressCode() {
        String DressCode="Sexy";
        List<Party> party = PartyData.getParty();
        List<Party> result=party.stream()
                .filter(p->p.getDressCode().equals(DressCode))
                .collect(Collectors.toList());
        System.out.println(result);
    }

}
