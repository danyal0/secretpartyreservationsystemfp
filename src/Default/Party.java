package Default;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Party {
    private Integer capacity;
    private String dressCode;
    private String name;
    private Place place;
    private LocalDate date;
    private User hostUser;
    private List<Reservation> guestReservList;


    public Party(Integer capacity, String dressCode, String name, Place place, LocalDate date, User hostUser) {
        this.capacity = capacity;
        this.dressCode = dressCode;
        this.name = name;
        this.place = place;
        this.date = date;
        this.hostUser = hostUser;
        guestReservList = new ArrayList<>();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public User getHostUser() {
        return hostUser;
    }

    public void setHostUser(User hostUser) {
        this.hostUser = hostUser;
    }

    public List<Reservation> getGuestReservList() {
        return guestReservList;
    }

    public void setGuestReservList(List<Reservation> guestReservList) {
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

    @Override
    public String toString() {
        return "Party{" +
                "capacity=" + capacity +
                ", dressCode='" + dressCode + '\'' +
                ", name='" + name + '\'' +
                ", place=" + place +
                ", date=" + date +
                ", hostUser=" + hostUser +
                ", guestReservList=" + guestReservList +
                '}';
    }
}
