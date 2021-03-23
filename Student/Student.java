public class Student {
    private int Id;
    private String naam;
    private String achternaam;
    private String wachtwoord;

    public Student(int Id, String naam, String achternaam, String wachtwoord) {
        this.Id = Id;
        this.naam = naam;
        this.achternaam = achternaam;
        this.wachtwoord = wachtwoord;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) { Id = id; }

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
