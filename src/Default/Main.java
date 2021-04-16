package Default;


import org.junit.Assert;

import java.time.LocalDate;
import java.util.List;


import java.util.*;
import java.lang.reflect.ParameterizedType;
import java.time.Clock;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        List<Party> parties = DataSource.partyList();
        Host host = new Host();
        String hostName = "Rose Smith";
        host.setPartiesList(parties);
        LocalDate date = LocalDate.of(2020,03,03);
        System.out.println("-----------------------------------------\n"
                + "How much a HOST earn in one year\n$ " + Utils.amountHostEarnedPerYear.apply(host, hostName, date));
        System.out.println("\n-----------------------------------------\n"
                +"The two parties that have more guests in a exactly a month\n" + Utils.partyWithMoreGuestInAMonth.apply(parties,date));
        System.out.println("\n-----------------------------------------\n"
                +"Names of Guests that choose the party with highest level of privacy\n" + Utils.guestsChoosePartyHighPrivacy.apply(parties));


        System.out.println("By Month:");
        PartyByMonth();
        System.out.println("\nSort By Time ASC:");
        SortPartyByTime();
        System.out.println("\nParty With Largest Capacity:");
        PartyWithLargestCapacity();
        getPartiesCountByPlace();

        getListOfUsersThatHaveReservationsInCityToday();
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
        System.out.println(PartyUtils.SortPartyByMonth.apply(party,compareDate));
    }
    public static void SortPartyByTime() {
        LocalDate compareDate=LocalDate.parse("2021-05-16");
        List<Party> party = PartyData.getParty();
        System.out.println(PartyUtils.SortPartyByTime.apply(party,compareDate));
    }
    public static void PartyWithLargestCapacity() {
        List<Party> party = PartyData.getParty();
        Optional<Party> MAX = party.stream().max((str1, str2) ->
                Integer.compare(str1.getCapacity(),
                        str2.getCapacity()));
        System.out.println("Party Name:"+MAX.get().getName()+", with Capacity of:"+MAX.get().getCapacity());
    }

    public static void getListOfUsersThatHaveReservationsInCityToday(){
        List<UserRole> role = new ArrayList<>();
        User muser1 = new User("John","12",role,"johny@gmail.com",LocalDate.parse("2009-05-01"));
        User muser2 = new User("Doe","12",role,"johne@gmail.com",LocalDate.parse("2000-05-01"));
        Address address1 = new Address("1000N 4th Street","Fairfield","IA","52557");
        Address address2 = new Address("1000N 4th Street","Fairfield","IA","52557");
        Place place1 = new Place("House 240-B",3,address1);
        Place place2 = new Place("House 241-B",3,address2);
        Party party1 = new Party(4, "Coca-Cola", "a",place1,LocalDate.now(),muser1,"2021-05-01");
        Party party2 = new Party(4, "Coca-Cola", "a",place1,LocalDate.now(),muser2,"2021-05-01");
        Party party3 = new Party(4, "Formal", "a",place2,LocalDate.parse("2021-04-15"),muser1,"2021-05-01");
        List<Reservation> reservations = new ArrayList<Reservation>();
        reservations.add(new Reservation(muser2, party2, Status.ACCEPT,1));
        reservations.add(new Reservation(muser1, party1, Status.WAITING,2));
        reservations.add(new Reservation(muser2, party2, Status.REJECT,3));
        reservations.add(new Reservation(muser2, party2, Status.ACCEPT,4));
        reservations.add(new Reservation(muser1, party1, Status.ACCEPT,5));
        reservations.add(new Reservation(muser2, party2, Status.WAITING,6));
        reservations.add(new Reservation(muser1, party3, Status.REJECT,7));
        reservations.add(new Reservation(muser1, party3, Status.ACCEPT,8));

        System.out.print("\nList of users that have a reservations in fairfield today:\n");
        List<User> user1 = FunctionalUtils.UsersThatHaveReservationsInXCityToday.apply(reservations,"Fairfield");
        for (User u1:user1) {
            System.out.println("Name: "+u1.getName()+" DOB: "+u1.getDateOfBirth());
        }


        System.out.print("\nList of users that have a reservations in fairfield today and are less than 18 years old:\n");
        List<User> user2 = FunctionalUtils.UsersThatHaveReservationsInXCityTodayAndAreLessThanEighteen.apply(reservations,"Fairfield",18);
        for (User u2:user2) {
            System.out.println("Name: "+u2.getName()+" DOB: "+u2.getDateOfBirth());
        }
    }

}
