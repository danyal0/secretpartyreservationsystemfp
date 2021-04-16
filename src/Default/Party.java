package Default;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;

public class Party {
    private Integer capacity;
    private String dressCode;
    private String name;
    private Place place;
    private LocalDate date;
    private User hostUser;
    private List<Reservation> guestReservList;
    private String eventtime;


    public Party(Integer capacity, String dressCode, String name, Place place, LocalDate date, User hostUser, String eventtime) {

            this.capacity = capacity;
            this.dressCode = dressCode;
            this.name = name;
            this.place = place;
            this.date = date;
            this.hostUser = hostUser;
            guestReservList = new ArrayList<>();
            this.eventtime = eventtime;
        }

        public LocalDate getDate () {
            return date;
        }

        public void setDate (LocalDate date){
            this.date = date;
        }

        public User getHostUser () {
            return this.hostUser;
        }

        public void setHostUser (User hostUser){
            this.hostUser = hostUser;
        }

        public List<Reservation> getGuestReservList () {
            return guestReservList;
        }

        public void setGuestReservList (List < Reservation > guestReservList) {
            this.guestReservList = guestReservList;
        }

        public Place getPlace () {
            return this.place;
        }

        public void setPlace (Place place){
            this.place = place;
        }

        public Integer getCapacity () {
            return capacity;
        }

        public void setCapacity (Integer capacity){
            this.capacity = capacity;
        }

        public String getDressCode () {
            return dressCode;
        }

        public void setDressCode (String dressCode){
            this.dressCode = dressCode;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }


        public String getEventtime () {
            return eventtime;
        }

        public void setEventtime (String eventtime){
            this.eventtime = eventtime;
        }

        @Override
        public String toString () {
            StringBuilder sb = new StringBuilder("<");
            sb.append("Party Name: " + name);
            sb.append(" Capacity: " + capacity);
            sb.append(" DressCode: " + dressCode);
            sb.append(" Date: " + date);
            sb.append(" Time: " + eventtime);
            sb.append(">");
            return sb.toString();


        }

    }

