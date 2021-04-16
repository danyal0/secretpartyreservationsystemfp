package Default;

import java.util.Calendar;
import java.util.Date;

public abstract class TestFactory {
	
	static public UserU createUser(String name, String email, String password, int year, int month, int day) {
		Calendar myCal = Calendar.getInstance();
        myCal.set(Calendar.YEAR, year);
        myCal.set(Calendar.MONTH, month);
        myCal.set(Calendar.DAY_OF_MONTH, day);
        Date dateOfBirth = myCal.getTime();
		
		UserU userU = new UserU();
		userU.setName(name);
		userU.setEmail(email);
		userU.setPassword(password);
		userU.setDateOfBirth(dateOfBirth);
		userU.setRoles(null);
		return userU;
	}
	
	static public PartyU createParty(String name, int capacity, Date partyDate, String dressCode, Place place) {
        PartyU partyU = new PartyU();
        partyU.setCapacity(capacity);
        partyU.setDate(partyDate);
        partyU.setDressCode(dressCode);
        partyU.setName(name);
        partyU.setPlace(place);
        
        return partyU;
    }
	
	static public Host createHost() {
		Host host = new Host();
		return host;
	}
	
	static public Place createPlace(AddressU addressU, int levelOfPrivacy, String name) {
		Place place = new Place();
		place.setAddress(addressU);
		place.setLevelOfPrivacy(levelOfPrivacy);
		place.setName(name);
		return place;
	}
	
	static public AddressU createAddress(String street, String city, String state, String zip) {
		AddressU addressU = new AddressU();
		addressU.setStreet(street);
		addressU.setCity(city);
		addressU.setState(state);
		addressU.setZip(zip);
		return addressU;
	}
	
	static public ReservationU createReservation(UserU userU, PartyU partyU, int pressCode, int price) {
		ReservationU reservationU = new ReservationU();
		reservationU.setGuest(userU);
		reservationU.setParty(partyU);
		reservationU.setPressCode(pressCode);
		reservationU.setPrice(price);
		reservationU.setStatus(Status.ACCEPT);
		return reservationU;
	}
	
	static public GuestU createGuest(UserU userU, ReservationU reservationU) {
		GuestU guestU = new GuestU(userU, reservationU);
		return guestU;
	}

}
