package Default;

public class Party {
    private Integer capacity;
    private String dressCode;
    private String name;
    private String partyDate;
    private String partyTime;

    public Party(Integer capacity, String dressCode, String name, String partyDate, String partyTime) {
        this.capacity = capacity;
        this.dressCode = dressCode;
        this.name = name;
        this.partyDate = partyDate;
        this.partyTime = partyTime;
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

    public String getPartyDate() {
        return partyDate;
    }

    public void setPartyDate(String partyDate) {
        this.partyDate = partyDate;
    }

    public String getPartyTime() {
        return partyTime;
    }

    public void setPartyTime(String partyTime) {
        this.partyTime = partyTime;
    }

}
