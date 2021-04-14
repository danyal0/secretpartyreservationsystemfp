package Default;

public class Reservation {

    private String status;
    private Integer pressCode;

    public Reservation(String status, Integer pressCode) {
        this.status = status;
        this.pressCode = pressCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPressCode() {
        return pressCode;
    }

    public void setPressCode(Integer pressCode) {
        this.pressCode = pressCode;
    }

}
