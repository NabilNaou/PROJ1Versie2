import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Exam
{
    public static Database database;


    private String ExamenNaam;
    protected int inlogid = Login.getCurrentUser();
    Student huidig = Student.zoekStudentViaID(inlogid);


    //Maakt een nieuwe exame aan de naam die je meegeeft en met een lijst van deelnemers.
    public Exam(String ExamenNaam){
        this.ExamenNaam = ExamenNaam;
        database.alleExamens.add(this);
    }

    public static void startExamen(int beslissing){
        int stuID = Login.getCurrentUser();
        Exam nieuw;
        Student huidig = Student.zoekStudentViaID(stuID);
        String Naam = Student.zoekStudentViaID(stuID).getNaam();

        if(beslissing == 1){
            nieuw = new Exam("autoexamen");
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
        huidig.persoonlijkeCijferlijst.addCijfer(cijfer);
        System.out.println("Uw heeft " + aantalgoed+ " vragen goed.");
    }

    //Nabil: Voegt deelnemer toe aan examen
    public void addDeelnemer(Student student, int typeExame){
        if(typeExame == 1) {
            database.AutoExamenDeelnemers.add(student);
        }else{
            if(typeExame == 2){
                database.VaarExamenDeelnemers.add(student);
            }
        }

    }

    public void addExamen(Exam examen){
        database.alleExamens.add(examen);
    }


    //Nabil: Returnt examen naam
    public String getExamenNaam(){
        return ExamenNaam;
    }

    //Nabil: Zoekt examen op naam, en returnt heel examen object.
    public static Exam zoekExamen(String examenNaam){
        for(int i = 0; i < database.alleExamens.size(); i++){
            if(database.alleExamens.get(i).getExamenNaam().equalsIgnoreCase(examenNaam)){
                return database.alleExamens.get(i);
            }
        }
        return null;
    }
}
