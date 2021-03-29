import java.util.ArrayList;
import java.util.Scanner;

public class Exam
{
    private static ArrayList<Exam> alleExamens = new ArrayList<>();
    private String ExamenNaam;
    private Integer Cijfer;

    private ArrayList<Vraag> vragen = new ArrayList<>();
    private ArrayList<Student> deelnemers = new ArrayList<>();
    private Vraag vraag;

    //Nabil: Aangepast zodat de examen word toegevoegd aan een alle examens arraylist
    public Exam(String ExamenNaam){
        this.ExamenNaam = ExamenNaam;
        alleExamens.add(this);
    }

    public void startTest(){
        Scanner scan = new Scanner(System.in);
        int testLength = vragen.size();
        int i = 0;

        while (i < testLength) {
            vraag = vragen.get(i);
            String correctAnswer = vraag.getAntwoord();
            System.out.println(vraag.getVraag());
            System.out.println(vraag.getAntA());
            System.out.println(vraag.getAntB());
            System.out.println(vraag.getAntC());
            String userAnswer = scan.nextLine();

            if (userAnswer.equals(correctAnswer))
            {
                Cijfer++;
            }
            i++;
        }
        System.out.println("Jouw cijfer is:" + Cijfer * (10 / testLength));
    }
    //Nabil: Voegt deelnemer toe aan examen
    public void addDeelnemer(Student student){
        deelnemers.add(student);
    }

    public void addExamen(Exam examen){
        alleExamens.add(examen);
    }

    public Integer getCijfer(){
        return Cijfer;
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
}
