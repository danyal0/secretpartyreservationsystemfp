package Default;

import java.time.LocalDate;
import java.util.*;

public class DataSource {
    public static List<Party> partyList(){
        Party party1 = new Party(300, "Casual", "Sweet Red", new Place("The Bridge", 8, new Address("1000 4th nt street", "Spring Field", "IO", "34565")), LocalDate.of(2020,03,03), new User("Rose Smith"), "10:00 am");
        Party party2 = new Party(34, "Costume", "Caribean Wynne",new Place("Three Trees", 7, new Address("1000 4th nt street", "Spring Field", "IO", "34565")), LocalDate.of(2020,03,03), new User("Grace Phillip"),"10:00 am");
        Party party3 = new Party(390, "Casual", "The Blue on Your Ayes", new Place("The Mountain", 9, new Address("1000 4th nt street", "Spring Field", "IO", "34565")), LocalDate.of(2020,03,03), new User("Robert Brown"),"10:00 am");

        Reservation res1 = new Reservation(new User("Angela"), party1, Status.ACCEPT, 34564,
                new Payment(LocalDate.of(2020,03,03), 345.5), LocalDate.of(2020,03,03));
        Reservation res2 = new Reservation(new User("July"), party1, Status.ACCEPT, 34564,
                new Payment(LocalDate.of(2020,03,03), 345.5), LocalDate.of(2020,03,03));
        Reservation res3 = new Reservation(new User("Karl"), party1, Status.WAITING, 34564,
                new Payment(LocalDate.of(2020,03,03), 345.5), LocalDate.of(2020,03,03));

        Reservation res4 = new Reservation(new User("Lye"), party1, Status.ACCEPT, 34564,
                new Payment(LocalDate.of(2020,03,03), 50.40), LocalDate.of(2020,03,03));
        Reservation res5 = new Reservation(new User("Ash"), party1, Status.ACCEPT, 34564,
                new Payment(LocalDate.of(2020,03,03), 50.40), LocalDate.of(2020,03,03));
        Reservation res6 = new Reservation(new User("Kristian"), party1, Status.ACCEPT, 34564,
                new Payment(LocalDate.of(2020,03,03), 50.40), LocalDate.of(2020,03,03));
        Reservation res7 = new Reservation(new User("Sultan"), party1, Status.ACCEPT, 34564,
                new Payment(LocalDate.of(2020,03,03), 50.40), LocalDate.of(2020,03,03));

        Reservation res8 = new Reservation(new User("Tim"), party1, Status.ACCEPT, 34564,
                new Payment(LocalDate.of(2020,03,03), 890.40), LocalDate.of(2020,03,03));
        Reservation res9 = new Reservation(new User("Kin"), party1, Status.ACCEPT, 34564,
                new Payment(LocalDate.of(2020,03,03), 890.40), LocalDate.of(2020,03,03));

        List<Reservation> reservationList1 = Arrays.asList(res1, res2, res3);
        party1.setGuestReservList(reservationList1);

        List<Reservation> reservationList2 = Arrays.asList(res4, res5, res6, res7);
        party2.setGuestReservList(reservationList2);

        List<Reservation> reservationList3 = Arrays.asList(res8, res9);
        party3.setGuestReservList(reservationList3);

        List<Party> parties = new LinkedList<Party>();
        parties.add(party1);
        parties.add(party2);
        parties.add(party3);

        return parties;
    }
}
