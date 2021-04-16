package Default;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartyU {
    private Integer capacity;
    private String dressCode;
    private String name;
    private Place place;
    private Date date;
    private UserU hostUserU;
    private List<ReservationU> guestReservList;
    
    public PartyU() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartyU(Integer capacity, String dressCode, String name, Place place, Date date, UserU hostUserU) {
        this.capacity = capacity;
        this.dressCode = dressCode;
        this.name = name;
        this.place = place;
        this.date = date;
        this.hostUserU = hostUserU;
        guestReservList = new ArrayList<>();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserU getHostUser() {
        return hostUserU;
    }

    public void setHostUser(UserU hostUserU) {
        this.hostUserU = hostUserU;
    }

    public List<ReservationU> getGuestReservList() {
        return guestReservList;
    }

    public void setGuestReservList(List<ReservationU> guestReservList) {
        this.guestReservList = guestReservList;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDressCode() {
        return dressCode;
    }

    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
