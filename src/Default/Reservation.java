package Default;

public class Reservation {
    private User guest;
    private Party party;
    private Status status;
    private Integer pressCode;
    private double price;
    
    public Reservation() {
		super();
	}

	public Reservation(User guest, Party party, Status status, Integer pressCode, double price) {
        this.guest = guest;
        this.party = party;
        this.status = status;
        this.pressCode = pressCode;
        this.price = price;
    }
	


    @Override
	public String toString() {
		return "Reservation [guest=" + guest.getName() + ", party=" + party.getName() + ", status=" + status + ", pressCode=" + pressCode
				+ ", price=" + price + "]";
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
 
}
