public class Gebruiker {
    private int id;
    private String naam;
    private String achternaam;
    private String wachtwoord;

    // dit is een gebruiker...
    public Gebruiker(int id, String naam, String achternaam, String wachtwoord) {
        this.id = id;
        this.naam = naam;
        this.achternaam = achternaam;
        this.wachtwoord = wachtwoord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) { this.id = id; }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
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
