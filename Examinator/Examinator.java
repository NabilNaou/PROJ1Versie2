import java.util.ArrayList;

public class Examinator {
    public static Examinator exLijst;
    private int id;
    private String naam;
    private String achternaam;
    private String wachtwoord;

    public Examinator(int id, String naam, String achternaam, String wachtwoord) {
        this.id = id;
        this.naam = naam;
        this.achternaam = achternaam;
        this.wachtwoord = wachtwoord;
    }

    public static ArrayList<Examinator> examinatorLijst = new ArrayList<>() {
        {
            add(exLijst = new Examinator(1,"Jan","Wild", "jan123"));
        }
    };

    // New examinator
    public static void addEx(Examinator newEx){
        Examinator.examinatorLijst.add(newEx);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
