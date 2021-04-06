import javax.xml.crypto.Data;
import java.util.Scanner;

import static java.lang.System.in;

public class Exam
{
    private String ExamenNaam;
    protected int inlogid = Login.getCurrentUser();

    //Maakt een nieuwe exame aan de naam die je meegeeft en met een lijst van deelnemers.
    public Exam(String ExamenNaam){
        this.ExamenNaam = ExamenNaam;
        Database.alleExamens.add(this);
    }

    public String getExamenNaam() {
        return ExamenNaam;
    }

    public static void startExamen(int beslissing){
        int stuID = Login.getCurrentUser();
        Exam nieuw;
        Student huidig = Student.zoekStudentViaID(stuID);
        String Naam = Student.zoekStudentViaID(stuID).getNaam();

        if(beslissing == 1){
            nieuw = new Exam("Autoexamen");
        }else{
            nieuw = new Exam("Bootexamen");
        }

        int a = 0;
        int aantalgoed = 0;
        Vragenlijst lijst = new Vragenlijst();
        lijst.MockDataBase();
        Scanner userInput = new Scanner(in);

        while(a < lijst.GetAutovragenlijst().size()){
            Vraag vraag = lijst.getvraag(a);
            String input;
            System.out.println("vraag "+ (a + 1) +" "+ vraag.getVraag());
            System.out.println(vraag.getAntA());
            System.out.println(vraag.getAntB());
            System.out.println(vraag.getAntC());
            System.out.println("Uw antwoord: ");
            input = userInput.nextLine();
            a++;
            if(input.equalsIgnoreCase(vraag.getAntwoord())){
                aantalgoed++;
            }
        }
        Cijfer cijfer = new Cijfer(aantalgoed, nieuw, huidig);
        Database.addCijfer(cijfer);
        System.out.println("Uw heeft " + aantalgoed+ " vragen goed.");
    }
}
