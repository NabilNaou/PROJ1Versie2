import java.util.ArrayList;

public class Examinator extends Gebruiker {
    public static Examinator exLijst;
    private int id;

    public Examinator(int id, String naam, String achternaam, String wachtwoord) {
        super(naam, achternaam, wachtwoord);
        this.id = id;
    }

    public static ArrayList<Examinator> examinatorLijst = new ArrayList<>() {
        {
            add(exLijst = new Examinator(1, "Jan", "Wild", "jan123"));
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


}
