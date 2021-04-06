import javax.xml.crypto.Data;
import java.util.ArrayList;


public class Examinator extends Gebruiker
{
    public int id;
//    protected static Database database;
    public Examinator(int id, String naam, String achternaam, String wachtwoord) {
        super(naam, achternaam, wachtwoord);
        this.id = id;
    }

    public static Examinator exLijst;

    public static ArrayList<Examinator> examinatorLijst = new ArrayList<>() {
        {
            add(exLijst = new Examinator(1,"Jan","wild", "jan123"));
        }
    };

    public int getId() {
        return id;
    }
}
