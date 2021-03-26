import java.util.ArrayList;

public class Examinator extends Gebruiker
{
    public Examinator(int id, String naam, String achternaam, String wachtwoord) {
        super(id, naam, achternaam, wachtwoord);
    }

    public static Examinator exLijst;

    public static ArrayList<Examinator> examinatorLijst = new ArrayList<>() {
        {
            add(exLijst = new Examinator(1,"Jan","Wild", "jan123"));
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

    public static void addEx(Examinator newEx){
        examinatorLijst.add(newEx);
    }
}