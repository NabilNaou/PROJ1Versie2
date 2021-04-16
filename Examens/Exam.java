import java.util.Scanner;
import static java.lang.System.in;


public class Exam
{
    private String examenNaam;
    protected int inlogid = Login.getCurrentUser();

    //Nabil: Maakt een nieuwe examen, en geeft dit door.
    public Exam(String ExamenNaam){
        this.examenNaam = ExamenNaam;
        Database.alleExamens.add(this);
    }
    public static void addVraag(){
        int input;
        System.out.println("type 1 voor openvraag of type 2 voor meerkeuzevraag?");
        Scanner userInput = new Scanner(in);
        input = userInput.nextInt();

        if(input == 1){
            Vraag nieuwvraag = new Vraag();
            System.out.println("Wat wilt u dat de vraag is?");
            nieuwvraag.description = userInput.nextLine();
            System.out.println("En Wat is het corrected antwoord?");
            String antwoord = userInput.nextLine();
            nieuwvraag.antwoorden.add(antwoord);
        }else if(input == 2){
            int aantal;
            Vraag nieuwevraag = new Vraag();
            System.out.println("Kies een getal tussen 1-26 voor het aantal antwoorden.");
            aantal = userInput.nextInt();
            if(aantal < 1 | aantal > 26) {
                System.out.println("sorry maar u heeft een verkeerd getal ingevoerd.");
            }if(aantal > 0 & aantal < 26) {
                System.out.println("Wat wilt u dat de vraag is?");
                String vraag = userInput.nextLine();
                char x = 'a';
                nieuwevraag.description = userInput.nextLine();
                for (int i = 0; i < aantal; i++) {
                    System.out.println("Antwoord " + x + " moet zijn?");
                    String antwoord = userInput.nextLine();
                    nieuwevraag.antwoorden.add(antwoord);
                    x++;
                }
                System.out.println("Uw vraag is toegevoegd.");
            }
        }if (input < 1 | input > 2){
            System.out.println("sorry maar u heeft een verkeerd getal ingevoerd.");
        }
    }


    public String getExamenNaam() {
        return examenNaam;
    }

   public static void startExamen(int beslissing) {
//TODO
   }
}