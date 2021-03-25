import java.util.ArrayList;
import java.util.Scanner;

public class Vragen
{
    public static ArrayList<Vraag> getVragenLijst() {
        return VragenLijst;
    }
    private static final ArrayList<Vraag> VragenLijst = new ArrayList<>();

    private static void TestMultipleChoice()
    {
        Vraag Vraag1 = new Vraag(
                "Je rijdt 's nachts met een aanhangwagen waarvan de toegestane maximummassa minder is dan 750 kilogram. Welke verlichting is verplicht? ",
                "A) Mistachterlicht.",
                "B) Mistachterlicht en achteruitrijlicht(en).",
                "C) Mistachterlicht, achteruitrijlicht(en) en waarschuwingsknipperlichten.",
                "A");
        Vraag Vraag2 = new Vraag(
                "Je rijdt buiten de bebouwde kom. Je wilt inhalen op een weg met één rijstrook. Waarmee hou je rekening?",
                "A) Ik kan bestuurders uit zijwegen niet goed zien.",
                "B) Ik mag alleen inhalen op rechte stukken.",
                "C) Ik zie motorrijders soms minder goed dan personenauto's.",
                "c");
        Vraag Vraag3 = new Vraag(
                "Wanneer mag je tijdens een autorit whatsappen of sms'en?",
                "A) Nooit.",
                "B) Als je stilstaat voor een geopende brug of sluis.",
                "C) Als je het andere verkeer niet in gevaar brengt.",
                "b");
        VragenLijst.add(Vraag1);
        VragenLijst.add(Vraag2);
        VragenLijst.add(Vraag3);
    }

    private static void TestOpenVragen(){
        Vraag Vraag1 = new Vraag(
                "Hoeveel wielen heeft een auto?",
                "Vier");
        Vraag Vraag2 = new Vraag(
                "Moet je altijd stoppen voor een rood licht?",
                "Ja");
        Vraag Vraag3 = new Vraag(
                "Is een APK-keurig verplicht?",
                "ja");
        VragenLijst.add(Vraag1);
        VragenLijst.add(Vraag2);
        VragenLijst.add(Vraag3);
    }

    public void NieuwMultipleChoice(String vraag, String antA, String antB, String antC, String antwoord){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wat is de vraag die je wilt toevoegen?:");
        vraag = scan.nextLine();
        System.out.println("Vul antwoord A in:");
        antA = scan.nextLine();
        System.out.println("Vul antwoord B in");
        antB = scan.nextLine();
        System.out.println("Vult antwoord C in");
        antC = scan.nextLine();
        System.out.println("Wat is het antwoord?");
        antwoord = scan.nextLine();
        Vraag NieuwVraag = new Vraag(vraag, antA, antB, antC, antwoord);
    }

    public void NieuwOpenVraag(String vraag, String antwoord){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wat is de vraag die je wilt toevoegen?:");
        vraag = scan.nextLine();
        System.out.println("Wat is het antwoord?");
        antwoord = scan.nextLine();
        Vraag nieuwVraag = new Vraag(vraag, antwoord);
    }
}