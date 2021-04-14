package Default;

public class Reservation {
    private User guest;
    private Party party;
    private Status status;
    private Integer pressCode;

    public Reservation(User guest, Party party, Status status, Integer pressCode) {
        this.guest = guest;
        this.party = party;
        this.status = status;
        this.pressCode = pressCode;
    }

    public User getGuest() {
        return guest;
    }

    public void setGuest(User guest) {
        this.guest = guest;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public Integer getPressCode() {
        return pressCode;
    }

    public void setPressCode(Integer pressCode) {
        this.pressCode = pressCode;
    }

}
