package Default;

import java.util.ArrayList;
import java.util.List;

public class Place {

    private String name;
    private Integer levelOfPrivacy;
    private Address address;


    public Place(String name, Integer levelOfPrivacy, Address address) {
        this.name = name;
        this.levelOfPrivacy = levelOfPrivacy;
        this.address = address;

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", levelOfPrivacy=" + levelOfPrivacy +
                ", address=" + address +
                '}';
    }
}
