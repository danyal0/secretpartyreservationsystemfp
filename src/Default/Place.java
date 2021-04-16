package Default;

public class Place {

    private String name;
    private Integer levelOfPrivacy;
    private AddressU addressU;

    public Place() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Place(String name, Integer levelOfPrivacy, AddressU addressU) {
        this.name = name;
        this.levelOfPrivacy = levelOfPrivacy;
        this.addressU = addressU;

    }

    public AddressU getAddress() {
        return addressU;
    }

    public void setAddress(AddressU addressU) {
        this.addressU = addressU;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevelOfPrivacy() {
        return levelOfPrivacy;
    }

    public void setLevelOfPrivacy(Integer levelOfPrivacy) {
        this.levelOfPrivacy = levelOfPrivacy;
    }
}
