import javax.xml.crypto.Data;
import java.util.ArrayList;


public class Examinator extends Gebruiker
{
//    protected static Database database;
    public Examinator(int id, String naam, String achternaam, String wachtwoord) {
        super(id, naam, achternaam, wachtwoord);
    }

    public static Examinator exLijst;

    public static ArrayList<Examinator> examinatorLijst = new ArrayList<>() {
        {
            add(exLijst = new Examinator(1,"Jan","wild", "jan123"));
        }
    };

    // Get all data for every examinator
    public static ArrayList<Examinator> getAllExaminators() {
        for (Examinator examinator : examinatorLijst)
        {
            System.out.println(examinator.getId() + " " + examinator.getNaam() + " " + examinator.getAchternaam());
        }
        return examinatorLijst;
    }

    public static ArrayList<Examinator> getExaminatorLijst() { return examinatorLijst; }

    public static void meesteExames() {
        if (Database.Studentenlijst.size() == 0) {
            System.out.println(" niemand heeft nog een examen afgenomen");
        } else {
            Student index = Database.Studentenlijst.get(0);
            int huidigeaantal = 0;
            for (int i = 0; i <= Database.Studentenlijst.size(); i++) {
                index = Database.Studentenlijst.get(i);
                if (huidigeaantal < index.persoonlijkeCijferlijst.getcijfer().size()) {
                    huidigeaantal = index.persoonlijkeCijferlijst.getcijfer().size();
                }
            }
            System.out.println("student " + index.getNaam() + " heeft " + huidigeaantal + " examens gedaan.");
        }
    }

    }
