public class Student {
    private Integer Id;
    private String Naam;
    private String Achternaam;
    private String Wachtwoord;

    public Student(Integer id, String naam, String achternaam, String wachtwoord) {
        this.Id = id;
        this.Naam = naam;
        this.Achternaam = achternaam;
        this.Wachtwoord = wachtwoord;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
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
