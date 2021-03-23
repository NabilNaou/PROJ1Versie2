import java.util.ArrayList;

public class Student {
    private int Id;
    private String naam;
    private String achternaam;
    private String wachtwoord;
    private ArrayList<String> Resultaten; //TODO: type veranderen naar Examens zodat je een betere resultaat overzicht kan maken.

    public Student(int Id, String naam, String achternaam, String wachtwoord) {
        this.Id = Id;
        this.naam = naam;
        this.achternaam = achternaam;
        this.wachtwoord = wachtwoord;
        Resultaten= new ArrayList<>();
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

    public void addResultaat(String resultaat){
        Resultaten.add(resultaat);
    }
}
