import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Examen {
    private Integer examenCode;
    private String examenNaam;
    private String status;
    public static Scanner userInput = new Scanner(System.in);
    //private static ArrayList<String> ExamenVragen = new ArrayList<>();
    private static ArrayList<String> Antwoorden = new ArrayList<>();


    public void StartAutoExamen(){
        Vragen.InitializeVragen();
        int AantalGoed = 0;
        String vraag;
        String antwoord;
        boolean process = true;
        for(int i = 0 ; i < Vragen.vragenlijst.size(); i++){
            vraag = Vragen.vragenlijst.get(i);
            System.out.println(vraag);
            antwoord = userInput.next();
            if (vraag.equalsIgnoreCase(Vragen.vraagA) && antwoord.equalsIgnoreCase("a")) {
                AantalGoed++;
            }else{
                if (vraag.equalsIgnoreCase(Vragen.vraagA) && antwoord.equalsIgnoreCase("b") || antwoord.equalsIgnoreCase("c"))
                System.out.println("Sorry, maar het antwoord was A) Mistachterlicht. \n");
            }

            if (vraag.equalsIgnoreCase(Vragen.vraagB) && antwoord.equalsIgnoreCase("c")){
                AantalGoed++;
            }else {
                if (vraag.equalsIgnoreCase(Vragen.vraagB) && antwoord.equalsIgnoreCase("b") | antwoord.equalsIgnoreCase("a")) {
                    System.out.println("Sorry, maar het antwoord was C) Ik zie motorrijders soms minder goed dan personenauto's. \n");
                }
            }

            if ( vraag.equalsIgnoreCase(Vragen.vraagC) && antwoord.equalsIgnoreCase("b")){
                AantalGoed++;
            }else {
                if (vraag.equalsIgnoreCase(Vragen.vraagC) && antwoord.equalsIgnoreCase("a") | antwoord.equalsIgnoreCase("c")) {
                    System.out.println("Sorry, maar het antwoord was B) Als je stilstaat voor een geopende brug of sluis. \n");
                }
            }
        }
        System.out.println("U heeft " + AantalGoed +" van de 3 vragen goed");
    }


    public Examen() {

    }





}
