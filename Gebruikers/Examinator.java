import java.util.ArrayList;

public class Examinator extends Gebruiker
{
    public Examinator(int id, String naam, String achternaam, String wachtwoord) {
        super(id, naam, achternaam, wachtwoord);
    }

    public static Examinator exLijst;

    public static ArrayList<Examinator> examinatorLijst = new ArrayList<>() {
        {
            add(exLijst = new Examinator(1,"Jan","wild", "jan123"));
        }
    };

    public static void addEx(Examinator newEx){
        examinatorLijst.add(newEx);
    }
}