import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Examen {
    private Integer examenCode;
    private String examenNaam;
    private String status;
    public static Scanner userInput = new Scanner(System.in);
    private static ArrayList<String> ExamenVragen = new ArrayList<>();
    private static ArrayList<String> Antwoorden = new ArrayList<>();


    private void InitializeVragen(){
        ExamenVragen.add("Je rijdt 's nachts met een aanhangwagen waarvan de toegestane maximummassa minder is dan 750 kilogram. Welke verlichting is verplicht? " +
                "\n A) Mistachterlicht. " +
                "\n B) Mistachterlicht en achteruitrijlicht(en)." +
                "\n C) Mistachterlicht, achteruitrijlicht(en) en waarschuwingsknipperlichten.");
        ExamenVragen.add("Je rijdt buiten de bebouwde kom. Je wilt inhalen op een weg met één rijstrook. Waarmee hou je rekening?" +
                "\n A) Ik kan bestuurders uit zijwegen niet goed zien. " +
                "\n B) Ik mag alleen inhalen op rechte stukken." +
                "\n C) Ik zie motorrijders soms minder goed dan personenauto's.");
        ExamenVragen.add("Wanneer mag je tijdens een autorit whatsappen of sms'en?" +
                "\n A) Nooit." +
                "\n B) Als je stilstaat voor een geopende brug of sluis." +
                "\n C) Als je het andere verkeer niet in gevaar brengt. ");
        Collections.shuffle(ExamenVragen);
    }

    public void StartAutoExamen(){
        InitializeVragen();
        int AantalGoed = 0;
        String vraag;
        String antwoord;
        boolean process = true;
        for(int i = 0 ; i < ExamenVragen.size(); i++){
            vraag = ExamenVragen.get(i);
            System.out.println(vraag);
            antwoord = userInput.next();
            if ( vraag.equalsIgnoreCase( "Je rijdt 's nachts met een aanhangwagen waarvan de toegestane maximummassa minder is dan 750 kilogram. Welke verlichting is verplicht? " +
                    "\n A) Mistachterlicht. " +
                    "\n B) Mistachterlicht en achteruitrijlicht(en)." +
                    "\n C) Mistachterlicht, achteruitrijlicht(en) en waarschuwingsknipperlichten.") && antwoord.equalsIgnoreCase("a")) {
                AantalGoed++;
            }else{
                if(vraag.equalsIgnoreCase( "Je rijdt 's nachts met een aanhangwagen waarvan de toegestane maximummassa minder is dan 750 kilogram. Welke verlichting is verplicht? " +
                        "\n A) Mistachterlicht. " +
                        "\n B) Mistachterlicht en achteruitrijlicht(en)." +
                        "\n C) Mistachterlicht, achteruitrijlicht(en) en waarschuwingsknipperlichten.") && antwoord.equalsIgnoreCase("b")| antwoord.equalsIgnoreCase("c")){
                    System.out.println("Sorry maar het antwoord was A) Mistachterlicht. \n");
                }
            }

            if (vraag.equalsIgnoreCase( "Je rijdt buiten de bebouwde kom. Je wilt inhalen op een weg met één rijstrook. Waarmee hou je rekening?" +
                    "\n A) Ik kan bestuurders uit zijwegen niet goed zien. " +
                    "\n B) Ik mag alleen inhalen op rechte stukken." +
                    "\n C) Ik zie motorrijders soms minder goed dan personenauto's.") && antwoord.equalsIgnoreCase("c")){
                AantalGoed++;
            }else {
                if (vraag.equalsIgnoreCase("Je rijdt buiten de bebouwde kom. Je wilt inhalen op een weg met één rijstrook. Waarmee hou je rekening?" +
                        "\n A) Ik kan bestuurders uit zijwegen niet goed zien. " +
                        "\n B) Ik mag alleen inhalen op rechte stukken." +
                        "\n C) Ik zie motorrijders soms minder goed dan personenauto's.") && antwoord.equalsIgnoreCase("b") | antwoord.equalsIgnoreCase("a")) {
                    System.out.println("Sorry maar het antwoord was C) Ik zie motorrijders soms minder goed dan personenauto's. \n");
                }
            }

            if ( vraag.equalsIgnoreCase( "Wanneer mag je tijdens een autorit whatsappen of sms'en?" +
                    "\n A) Nooit." +
                    "\n B) Als je stilstaat voor een geopende brug of sluis." +
                    "\n C) Als je het andere verkeer niet in gevaar brengt. ") && antwoord.equalsIgnoreCase("b")){
                AantalGoed++;
            }else {
                if (vraag.equalsIgnoreCase("Wanneer mag je tijdens een autorit whatsappen of sms'en?" +
                        "\n A) Nooit." +
                        "\n B) Als je stilstaat voor een geopende brug of sluis." +
                        "\n C) Als je het andere verkeer niet in gevaar brengt. ") && antwoord.equalsIgnoreCase("a") | antwoord.equalsIgnoreCase("c")) {
                    System.out.println("Sorry maar het antwoord was B) Als je stilstaat voor een geopende brug of sluis. \n");
                }
            }
        }
        System.out.println("U heeft " + AantalGoed +" van de 3 vragen goed");
    }


    public Examen() {

    }





}
