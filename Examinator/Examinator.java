public class Examinator {
    private Integer Id;
    private String Name;
    private String Achternaam;
    private String Wachtwoord;

    public Examinator(Integer id, String name, String achternaam, String wachtwoord) {
        this.Id = id;
        this.Name = name;
        this.Achternaam = achternaam;
        this.Wachtwoord = wachtwoord;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAchternaam() {
        return Achternaam;
    }

    public void setAchternaam(String achternaam) {
        Achternaam = achternaam;
    }

    public String getWachtwoord() {
        return Wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        Wachtwoord = wachtwoord;
    }
}
