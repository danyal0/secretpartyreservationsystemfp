package Default;

import java.util.List;


public class Host {
    private int rating;

    private List<Party> partiesList;

    public List<Party> getPartiesList() {
        return partiesList;
    }

    public void setPartiesList(List<Party> partiesList) {
        this.partiesList = partiesList;
    }
}