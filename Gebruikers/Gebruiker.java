public class Gebruiker {
    private String naam;
    private String achternaam;
    private String wachtwoord;

    public Gebruiker(String naam, String achternaam, String wachtwoord) {
        this.naam = naam;
        this.achternaam = achternaam;
        this.wachtwoord = wachtwoord;
    }

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
