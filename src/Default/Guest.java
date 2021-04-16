package Default;

import java.util.ArrayList;
import java.util.List;

public class Guest implements UserRole {
	private String id;
	private String name;
    private List<Reservation> reservationList;
    
    public Guest(String name, String id, Reservation reservation) {
    	this.id = id;
    	this.name = name;
    	this.reservationList = new ArrayList<Reservation>();
    	addReservation(reservation);
    }

	public void addReservation(Reservation reservation) {
		this.reservationList.add(reservation);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Reservation> getReservationList() {
		return reservationList;
	}

	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}
}
