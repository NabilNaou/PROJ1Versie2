import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.in;


public class Exam
{
    private String examenNaam;


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

        int uitslag = 0;

        String invoer;
        int inlogid = Login.getCurrentUser();
        Scanner userInput = new Scanner(in);

        if(beslissing == 1){ // 1 = multiple choice

            ArrayList<Vraag> vragenlijst = new ArrayList<>();
            for(int i = 0 ; i < 5; i++) {
                vragenlijst.add(Database.AutoExamenMultipleChoiceVragenlijst.get(i));
            }
            Collections.shuffle(vragenlijst);

            for(int i = 0; i < vragenlijst.size(); i++){
                char x = 'a';
                System.out.println(vragenlijst.get(i).description);
                for(String antwoord :vragenlijst.get(i).antwoorden) {
                    String n = String.valueOf(x);
                    System.out.println(n + " " + antwoord);
                    x++;
                }
                System.out.println("Welk van de bovenstaande keuzen is correct?");

                invoer = userInput.nextLine();
                if(invoer.equalsIgnoreCase(vragenlijst.get(i).antwoord)){
                    uitslag++;
                    System.out.println("Correct! \n");
                }else{
                    System.out.println("Helaas, maar het juisten keus was "+ vragenlijst.get(i).antwoord + "\n");
                }
            }
            System.out.println("Uw heeft  " + uitslag + " van de " + vragenlijst.size() + " goed.");
            double size = vragenlijst.size();
            double cijfer = (uitslag/size*100)/10;
            Toetsen toets = new Toetsen(Student.zoekStudentViaID(inlogid), "Multiple choice",cijfer);
            Database.studentenLijst.get(Student.zoekStudentViaID(inlogid).studentNummer).cijferlijst.add(toets);
        } else if(beslissing == 2){ // 2 = open vragen
            ArrayList<Vraag> vragenlijst = new ArrayList<>();
            String antwoord;
            for(int i = 0 ; i < 5; i++) {
                vragenlijst.add(Database.AutoExamenOpenVragenlijst.get(i));
            }
            Collections.shuffle(vragenlijst);
            for(int i = 0; i < vragenlijst.size(); i++){
                System.out.println(vragenlijst.get(i).description);
                invoer = userInput.next();
                if(invoer.equalsIgnoreCase(vragenlijst.get(i).antwoord)) {
                    uitslag++;
                    System.out.println("Correct! \n");
                }else {
                    System.out.println("Helaas, maar het juisten antwoord was " + vragenlijst.get(i).antwoord + "\n");
                }
            }
            System.out.println("Uw heeft  " + uitslag + " van de " + vragenlijst.size() + " goed.");
            double size = vragenlijst.size();
            double cijfer = (uitslag/size*100)/10;
            Toetsen toets = new Toetsen(Student.zoekStudentViaID(inlogid), "Open Vragen",cijfer);
            Database.studentenLijst.get(Student.zoekStudentViaID(inlogid).studentNummer-1).cijferlijst.add(toets);

        }
   }
}