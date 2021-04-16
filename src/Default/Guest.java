package Default;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/*
 * The List of reservation is made by guest
    - The total cost of the all reservation by the guest
    - What's the avarege of the age of the guests in particular party?
 */

public class Guest implements UserRole {
	private User user;
    private List<Reservation> reservationList;
    
    public Guest(User user, Reservation reservation) {
    	this.user = user;
    	this.reservationList = new ArrayList<Reservation>();
    	addReservation(reservation);
    }

	public void addReservation(Reservation reservation) {
		this.reservationList.add(reservation);
	}

	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	public List<Reservation> getReservationList() {
		return reservationList;
	}

	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}
	
	public double getTotalCostofReservation() {
		return this.reservationList.stream().map(p -> p.getPrice()).reduce((double) 0, Double::sum);
	}
}
