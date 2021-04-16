package Default;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FunctionalUtilsTest {

    @Test
    public void testHowManyPartiesWhereHostedInXCity(){

        List<UserRole> role = new ArrayList<>();
        Address address1 = new Address("1000N 4th Street","Fairfield","IA","52557");
        Address address2 = new Address("1004N 67th Street","Iowa City","IA","52555");
        Place place1 = new Place("House 240-B",3,address1);
        Place place2 = new Place("House 241-B",3,address2);
        User user = new User("John Doe","12",role,"john@gmail.com", LocalDate.parse("2021-05-01"));

        List<Party> parties = new ArrayList<Party>();
        parties.add(new Party(0, "Coca-Cola", "a",place1,LocalDate.parse("2021-05-01"),user,"2021-05-01"));
        parties.add(new Party(1, "Mountain Dew", "b",place2,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(2, "Mango Smoothie", "d",place2,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(3,"Orange Juice", "t",place1,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(4, "Dr. Pepper", "y",place2,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(5, "Sandwich", "u",place1,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(6, "Hamburger", "h",place1,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        parties.add(new Party(7, "Light Sandwich", "j",place1,LocalDate.parse("2019-05-16"),user,"2021-05-01"));
        Long expected = FunctionalUtils.HowManyPartiesWhereHostedInXCity.apply(parties,"Fairfield");
        assertEquals((long)expected,4);

    }

    @Test
    public void testUsersThatHaveReservationsInXCityToday(){
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
        assertEquals(FunctionalUtils.UsersThatHaveReservationsInXCityToday.apply(reservations,"Fairfield").size(),6);
//        assertEquals(FunctionalUtils.UsersThatHaveReservationsInXCityToday.apply(reservations,"Fairfield"), contains("John"));

    }

    @Test
    public void testUsersThatHaveReservationsInXCityTodayAndAreLessThanEighteen(){
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

            assertEquals(FunctionalUtils.UsersThatHaveReservationsInXCityTodayAndAreLessThanEighteen.apply(reservations,"Fairfield",18).size(),2);
    }

}