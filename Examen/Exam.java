import java.util.ArrayList;
import java.util.Scanner;

public class Exam
{
    private String ExamenNaam;
    private Integer Cijfer;

    private static ArrayList<Vraag> vragen;
    private int StudentID;
    private Vraag vraag;

    public Exam(int StudentID, ArrayList<Vraag> vragen, String ExamenNaam){
        this.StudentID = StudentID;
        this.vragen = vragen;
        this.ExamenNaam = ExamenNaam;
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
    public Integer getStudentID(){
        return StudentID;
    }
    public Integer getCijfer(){
        return Cijfer;
    }
}
