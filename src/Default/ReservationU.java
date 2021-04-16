package Default;

public class ReservationU {
    private UserU guest;
    private PartyU partyU;
    private Status status;
    private Integer pressCode;
    private double price;
    
    public ReservationU() {
		super();
	}

	public ReservationU(UserU guest, PartyU partyU, Status status, Integer pressCode, double price) {
        this.guest = guest;
        this.partyU = partyU;
        this.status = status;
        this.pressCode = pressCode;
        this.price = price;
    }
	


    @Override
	public String toString() {
		return "Reservation [guest=" + guest.getName() + ", party=" + partyU.getName() + ", status=" + status + ", pressCode=" + pressCode
				+ ", price=" + price + "]";
	}

	public UserU getGuest() {
        return guest;
    }

    public void setGuest(UserU guest) {
        this.guest = guest;
    }

    public PartyU getParty() {
        return partyU;
    }

    public void setParty(PartyU partyU) {
        this.partyU = partyU;
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
