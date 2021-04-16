package Default;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
    	getDetails();
        
    }
    
    public static void getDetails()
    {
    	UserU hostUserU = TestFactory.createUser("John", "john@gmail.com", "jhon", 1991, 5, 10);
        UserU guestUserU1 = TestFactory.createUser("Uulen", "uulen@gmail.com", "123", 1996, 3, 16);
        UserU guestUserU2 = TestFactory.createUser("Tony", "tony@gmail.com", "123", 1994, 7, 23);
        UserU guestUserU3 = TestFactory.createUser("Murun", "murun@gmail.com", "123", 1990, 1, 5);
        
        AddressU addressU1 = TestFactory.createAddress("2500 N Clybourn ave", "New York", "New York", "68748");
        Place place1 = TestFactory.createPlace(addressU1, 10, "Golden Park");
        PartyU partyU1 = TestFactory.createParty("Home party", 20, new Date(), "casual", place1);
        Host host1 = TestFactory.createHost();
        
        ReservationU reservationU1 = TestFactory.createReservation(guestUserU1, partyU1, 1001, 50);
        GuestU guestU1 = TestFactory.createGuest(guestUserU1, reservationU1);
        
        ReservationU reservationU2 = TestFactory.createReservation(guestUserU2, partyU1, 1001, 50);
        GuestU guestU2 = TestFactory.createGuest(guestUserU2, reservationU2);
        
        ReservationU reservationU3 = TestFactory.createReservation(guestUserU3, partyU1, 1001, 50);
        GuestU guestU3 = TestFactory.createGuest(guestUserU3, reservationU3);
        
        // All the reservations that the Host have got. 
        List<ReservationU> allReservationUS = new ArrayList<ReservationU>();
        allReservationUS.add(reservationU1);
        allReservationUS.add(reservationU2);
        allReservationUS.add(reservationU3);
        partyU1.setGuestReservList(allReservationUS);
        
        List<ReservationU> firstReservationUS = getAllAcceptedReservationByGuest(guestU1);
        List<ReservationU> secondReservationUS = getAllAcceptedReservationByGuest(guestU2);
        List<ReservationU> thirdReservationUS = getAllAcceptedReservationByGuest(guestU3);
        
        System.out.println("Reservation----->");
        System.out.println(firstReservationUS);
        System.out.println(secondReservationUS);
        System.out.println(thirdReservationUS);
        
        double cost1 = getTotalCostOfTheAllReservationByGuest(guestU1);
        double cost2 = getTotalCostOfTheAllReservationByGuest(guestU2);
        double cost3 = getTotalCostOfTheAllReservationByGuest(guestU3);
        
        System.out.println(" COST---->");
        System.out.println(cost1);
        System.out.println(cost2);
        System.out.println(cost3);
        
        double averegeAge = getAvaregeAgeInParticularParty(partyU1);
        
        System.out.println("AVG Age: " + averegeAge);
    }    
    // The Lists of accepted reservation is made by guest
    public static List<ReservationU> getAllAcceptedReservationByGuest(GuestU guestU) {
    	return guestU.getReservationList().stream()
    			.filter(p -> p.getStatus().equals(Status.ACCEPT))
    			.collect(Collectors.toList());
    }
    
    // The Total cost of the all the reservations by the guest
    public static double getTotalCostOfTheAllReservationByGuest(GuestU guestU) {
    	return guestU.getTotalCostofReservation();
    }
    
    // The average of the age of the guests in particular party?
    public static double getAvaregeAgeInParticularParty(PartyU partyU) {
    	return partyU.getGuestReservList().stream().mapToDouble(p -> p.getGuest().getAge()).average().getAsDouble();
    }
    

}
