import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Exam
{
    private static ArrayList<Exam> alleExamens = new ArrayList<>();    //een lijst met alle examens
    protected ArrayList<Student> deelnemers;  //een lijst met deelnemers
    private String ExamenNaam;
    protected int inlogid = Login.getCurrentUser();
    Student huidig = Student.zoekStudentViaID(inlogid);

    public void MeesteExamens(Student target){
        int amount = 0;
        for(int i = 0; i < alleExamens.size(); i++){
            for (Student deelnemer : deelnemers) {
                if (deelnemer.equals(target)) {
                    amount++;
                }
            }
        }
        System.out.println("de student "+ target.getNaam() + "heeft met "+amount +" het meeste exames afgenomen" );
    }

    //Maakt een nieuwe exame aan de naam die je meegeeft en met een lijst van deelnemers.
    public Exam(String ExamenNaam){
        this.ExamenNaam = ExamenNaam;
        deelnemers = new ArrayList<>();
        alleExamens.add(this);
    }

    public static void startExamen(int beslissing){
        int stuID = Login.getCurrentUser();
        Exam huidigexame;
        Student huidig = Student.zoekStudentViaID(stuID);

        if(beslissing == 1){
            huidigexame = new Exam("autoexamen");
        }else{
            huidigexame = new Exam("Bootexamen");
        }
        int inlogid = Login.getCurrentUser();
        String Naam = Student.zoekStudentViaID(inlogid).getNaam();
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
        Cijfer cijfer = new Cijfer(aantalgoed, huidigexame, huidig);
        huidig.persoonlijkeCijferlijst.addCijfer(cijfer);
        System.out.println("Uw heeft " + aantalgoed+ " vragen goed.");
    }

    //Nabil: Voegt deelnemer toe aan examen
    public void addDeelnemer(Student student){
        deelnemers.add(student);
    }

    public void addExamen(Exam examen){
        alleExamens.add(examen);
    }

    //Nabil: Returnt examen naam
    public String getExamenNaam(){
        return ExamenNaam;
    }

    //Nabil: Zoekt examen op naam, en returnt heel examen object.
    public static Exam zoekExamen(String examenNaam){
        for(int i = 0; i < alleExamens.size(); i++){
            if(alleExamens.get(i).getExamenNaam().equalsIgnoreCase(examenNaam)){
                return alleExamens.get(i);
            }
        }
        return null;
    }

    public int getCijfer(int a) {
        String naam;
        if (a == 1){
            naam = "autoexamen";
        }else{
            naam = "Bootexamen";
        }
        return (int) huidig.getPersoonlijkeCijferlijst().getcijfer(naam);
    }
}