package Default;


import java.util.*;
import java.lang.reflect.ParameterizedType;
import java.time.Clock;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("By Month:");
        PartyByMonth();
        System.out.println("\nSort By Time:");
        SortPartyByTime();
        System.out.println("\nParty With Largest Capacity:");
        PartyWithLargestCapacity();
        getPartiesCountByPlace();
    }
    public static void getPartiesCountByPlace(){


        List<UserRole> role = new ArrayList<>();
        Address address1 = new Address("1000N 4th Street","Fairfield","IA","52557");
        Address address2 = new Address("1004N 67th Street","Iowa City","IA","52555");
        Place place1 = new Place("House 240-B",3,address1);
        Place place2 = new Place("House 241-B",3,address2);
        User user = new User("John Doe","12",role,"john@gmail.com",LocalDate.parse("2021-05-01"));

        List<Party> parties = new ArrayList<Party>();
        parties.add(new Party(0, "Coca-Cola", "a",place1,LocalDate.parse("2021-05-01"),user,"2021-05-01"));
        parties.add(new Party(1, "Mountain Dew", "b",place2,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(2, "Mango Smoothie", "d",place2,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(3,"Orange Juice", "t",place1,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(4, "Dr. Pepper", "y",place2,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(5, "Sandwich", "u",place1,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(6, "Hamburger", "h",place1,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(7, "Light Sandwich", "j",place1,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        System.out.print("\nParties that where hosted in past in a Fairfield city: ");
        System.out.println(FunctionalUtils.HowManyPartiesWhereHostedInXCity.apply(parties,"Fairfield"));

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
               .sorted( (i1, i2) -> i1.getEventtime().compareTo(i2.getEventtime()) )
                .collect(Collectors.toList());
        System.out.println(result);
    }
    public static void PartyWithLargestCapacity() {
        List<Party> party = PartyData.getParty();
        Optional<Party> MAX = party.stream().max((str1, str2) ->
                Integer.compare(str1.getCapacity(),
                        str2.getCapacity()));
        System.out.println("Party Name:"+MAX.get().getName()+", with Capacity of:"+MAX.get().getCapacity());
    }

}
