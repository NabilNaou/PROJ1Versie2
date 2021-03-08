public class Examinator {
    private Integer id;
    private String name;
    private String achternaam;
    private String wachtwoord;

    public Examinator(Integer id, String name, String achternaam, String wachtwoord) {
        this.id = id;
        this.name = name;
        this.achternaam = achternaam;
        this.wachtwoord = wachtwoord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }
}
