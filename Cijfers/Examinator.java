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

    public static void meesteExames() {
        if (Database.studentenLijst.size() == 0) {
            System.out.println(" niemand heeft nog een examen afgenomen");
        } else {
            Student index = Database.studentenLijst.get(0);
            int huidigeaantal = 0;
            for (int i = 0; i <= Database.studentenLijst.size(); i++) {
                index = Database.studentenLijst.get(i);
                if (huidigeaantal < index.persoonlijkeCijferlijst.getcijfer().size()) {
                    huidigeaantal = index.persoonlijkeCijferlijst.getcijfer().size();
                }
            }
            System.out.println("student " + index.getNaam() + " heeft " + huidigeaantal + " examens gedaan.");
        }
    }

    public int getId() {
        return id;
    }
}
