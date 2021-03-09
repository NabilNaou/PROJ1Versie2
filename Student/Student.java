public class Student {
    public Integer Id;
    public String naam;
    public String achternaam;
    public String wachtwoord;

    public Student(Integer id, String naam, String achternaam, String wachtwoord) {
        this.Id = id;
        this.naam = naam;
        this.achternaam = achternaam;
        this.wachtwoord = wachtwoord;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public String getAllData() {
        return (getId() + "         - " + getNaam() + " " + getAchternaam());
    }
}
