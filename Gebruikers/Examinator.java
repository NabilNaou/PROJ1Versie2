public class Examinator extends Gebruiker
{
    public int id;
    public Examinator(int id, String naam, String achternaam, String wachtwoord) {
        super(naam, achternaam, wachtwoord);
        this.id = id;
    }

    // --Jarrel:

    //    public static void meesteExames() {
    //        if (Database.studentenLijst.size() == 0) {
    //            System.out.println(" niemand heeft nog een examen afgenomen");
    //        } else {
    //            Student index = Database.studentenLijst.get(0);
    //            int huidigeaantal = 0;
    //            for (int i = 0; i <= Database.studentenLijst.size(); i++) {
    //                index = Database.studentenLijst.get(i);
    //                if (huidigeaantal < index.Database.cijferList().size()) {
    //                    huidigeaantal = index.cijferList.getcijfer().size();
    //                }
    //            }
    //            System.out.println("student " + index.getNaam() + " heeft " + huidigeaantal + " examens gedaan.");
    //        }
    //    }

    public int getId() {
        return id;
    }
}