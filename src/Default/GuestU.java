package Default;

import java.util.ArrayList;
import java.util.List;


/*
 * The List of reservation is made by guest
    - The total cost of the all reservation by the guest
    - What's the avarege of the age of the guests in particular party?
 */

public class GuestU implements UserRole {
	private UserU userU;
    private List<ReservationU> reservationUList;
    
    public GuestU(UserU userU, ReservationU reservationU) {
    	this.userU = userU;
    	this.reservationUList = new ArrayList<ReservationU>();
    	addReservation(reservationU);
    }

	public void addReservation(ReservationU reservationU) {
		this.reservationUList.add(reservationU);
	}

	public UserU getUser() {
		return userU;
	}
	
	public void setUser(UserU userU) {
		this.userU = userU;
	}

	public List<ReservationU> getReservationList() {
		return reservationUList;
	}

	public void setReservationList(List<ReservationU> reservationUList) {
		this.reservationUList = reservationUList;
	}
	
	public double getTotalCostofReservation() {
		return this.reservationUList.stream().map(p -> p.getPrice()).reduce((double) 0, Double::sum);
	}
}
