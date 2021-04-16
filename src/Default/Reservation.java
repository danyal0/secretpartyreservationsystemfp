package Default;

import java.time.LocalDate;

public class Reservation{
    private User guest;
    private Party party;
    private Status status;
    private Integer pressCode;
    private Payment payment;
    private LocalDate date;

    public Reservation(User guest, Party party, Status status, Integer pressCode, Payment payment, LocalDate date) {
        this.guest = guest;
        this.party = party;
        this.status = status;
        this.pressCode = pressCode;
        this.payment = payment;
        this.date = date;
    }
    public Reservation(User guest, Party party, Status status, Integer pressCode) {
        this.guest = guest;
        this.party = party;
        this.status = status;
        this.pressCode = pressCode;
        this.payment = payment;
        this.date = date;
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

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "guest=" + guest +
                ", party=" + party +
                ", status=" + status +
                ", pressCode=" + pressCode +
                ", payment=" + payment +
                ", date=" + date +
                '}';
    }
}
