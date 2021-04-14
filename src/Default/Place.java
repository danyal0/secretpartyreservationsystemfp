package Default;

public class Place {

    private String code;
    private String name;
    private String history;
    private Integer levelOfPrivacy;

    public Place(String code, String name, String history, Integer levelOfPrivacy, Integer addressId) {
        this.code = code;
        this.name = name;
        this.history = history;
        this.levelOfPrivacy = levelOfPrivacy;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Integer getLevelOfPrivacy() {
        return levelOfPrivacy;
    }

    public void setLevelOfPrivacy(Integer levelOfPrivacy) {
        this.levelOfPrivacy = levelOfPrivacy;
    }
}
