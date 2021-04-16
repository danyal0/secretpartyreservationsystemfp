package Default;

import java.util.Calendar;
import java.util.Date;

public abstract class TestFactory {
	
	static public User createUser(String name, String email, String password, int year, int month, int day) {
		Calendar myCal = Calendar.getInstance();
        myCal.set(Calendar.YEAR, year);
        myCal.set(Calendar.MONTH, month);
        myCal.set(Calendar.DAY_OF_MONTH, day);
        Date dateOfBirth = myCal.getTime();
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setDateOfBirth(dateOfBirth);
		user.setRoles(null);
		return user;
	}
	
	static public Party createParty(String name, int capacity, Date partyDate, String dressCode, Place place) {
        Party party = new Party();
        party.setCapacity(capacity);
        party.setDate(partyDate);
        party.setDressCode(dressCode);
        party.setName(name);
        party.setPlace(place);
        
        return party;
    }
	
	static public Host createHost() {
		Host host = new Host();
		return host;
	}
	
	static public Place createPlace(Address address, int levelOfPrivacy, String name) {
		Place place = new Place();
		place.setAddress(address);
		place.setLevelOfPrivacy(levelOfPrivacy);
		place.setName(name);
		return place;
	}
	
	static public Address createAddress(String street, String city, String state, String zip) {
		Address address = new Address();
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);
		address.setZip(zip);
		return address;
	}
	
	static public Reservation createReservation(User user, Party party, int pressCode, int price) {
		Reservation reservation = new Reservation();
		reservation.setGuest(user);
		reservation.setParty(party);
		reservation.setPressCode(pressCode);
		reservation.setPrice(price);
		reservation.setStatus(Status.ACCEPT);
		return reservation;
	}
	
	static public Guest createGuest(User user, Reservation reservation) {
		Guest guest = new Guest(user, reservation);
		return guest;
	}

}
