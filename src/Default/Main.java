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
    	User hostUser = TestFactory.createUser("John", "john@gmail.com", "jhon", 1991, 5, 10);
        User guestUser1 = TestFactory.createUser("Uulen", "uulen@gmail.com", "123", 1996, 3, 16);
        User guestUser2 = TestFactory.createUser("Tony", "tony@gmail.com", "123", 1994, 7, 23);
        User guestUser3 = TestFactory.createUser("Murun", "murun@gmail.com", "123", 1990, 1, 5);
        
        Address address1 = TestFactory.createAddress("2500 N Clybourn ave", "New York", "New York", "68748");
        Place place1 = TestFactory.createPlace(address1, 10, "Golden Park");
        Party party1 = TestFactory.createParty("Home party", 20, new Date(), "casual", place1);
        Host host1 = TestFactory.createHost();
        
        Reservation reservation1 = TestFactory.createReservation(guestUser1, party1, 1001, 50);
        Guest guest1 = TestFactory.createGuest(guestUser1, reservation1);
        
        Reservation reservation2 = TestFactory.createReservation(guestUser2, party1, 1001, 50);
        Guest guest2 = TestFactory.createGuest(guestUser2, reservation2);
        
        Reservation reservation3 = TestFactory.createReservation(guestUser3, party1, 1001, 50);
        Guest guest3 = TestFactory.createGuest(guestUser3, reservation3);
        
        // All the reservations that the Host have got. 
        List<Reservation> allReservations = new ArrayList<Reservation>();
        allReservations.add(reservation1);
        allReservations.add(reservation2);
        allReservations.add(reservation3);
        party1.setGuestReservList(allReservations);
        
        List<Reservation> firstReservations = getAllAcceptedReservationByGuest(guest1);
        List<Reservation> secondReservations = getAllAcceptedReservationByGuest(guest2);
        List<Reservation> thirdReservations = getAllAcceptedReservationByGuest(guest3);
        
        System.out.println("Reservation----->");
        System.out.println(firstReservations);
        System.out.println(secondReservations);
        System.out.println(thirdReservations);
        
        double cost1 = getTotalCostOfTheAllReservationByGuest(guest1);
        double cost2 = getTotalCostOfTheAllReservationByGuest(guest2);
        double cost3 = getTotalCostOfTheAllReservationByGuest(guest3);
        
        System.out.println(" COST---->");
        System.out.println(cost1);
        System.out.println(cost2);
        System.out.println(cost3);
        
        double averegeAge = getAvaregeAgeInParticularParty(party1);
        
        System.out.println("AVG Age: " + averegeAge);
    }    
    // The Lists of accepted reservation is made by guest
    public static List<Reservation> getAllAcceptedReservationByGuest(Guest guest) {
    	return guest.getReservationList().stream()
    			.filter(p -> p.getStatus().equals(Status.ACCEPT))
    			.collect(Collectors.toList());
    }
    
    // The Total cost of the all the reservations by the guest
    public static double getTotalCostOfTheAllReservationByGuest(Guest guest) {
    	return guest.getTotalCostofReservation();
    }
    
    // The average of the age of the guests in particular party?
    public static double getAvaregeAgeInParticularParty(Party party) {
    	return party.getGuestReservList().stream().mapToDouble(p -> p.getGuest().getAge()).average().getAsDouble();
    }
    

}
