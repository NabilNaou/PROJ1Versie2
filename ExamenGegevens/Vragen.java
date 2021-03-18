import java.util.ArrayList;
import java.util.Collections;

public class Vragen {

    public static String vraagA = "Je rijdt 's nachts met een aanhangwagen waarvan de toegestane maximummassa minder is dan 750 kilogram. Welke verlichting is verplicht? " +
            "\n A) Mistachterlicht. " +
            "\n B) Mistachterlicht en achteruitrijlicht(en)." +
            "\n C) Mistachterlicht, achteruitrijlicht(en) en waarschuwingsknipperlichten.";
    public static String vraagB = "Je rijdt buiten de bebouwde kom. Je wilt inhalen op een weg met één rijstrook. Waarmee hou je rekening?" +
            "\n A) Ik kan bestuurders uit zijwegen niet goed zien. " +
            "\n B) Ik mag alleen inhalen op rechte stukken." +
            "\n C) Ik zie motorrijders soms minder goed dan personenauto's.";
    public static String vraagC = "Wanneer mag je tijdens een autorit whatsappen of sms'en?" +
            "\n A) Nooit." +
            "\n B) Als je stilstaat voor een geopende brug of sluis." +
            "\n C) Als je het andere verkeer niet in gevaar brengt. ";

    public static ArrayList<String> vragenlijst = new ArrayList();

    public ArrayList<String> getVragenlijst() {
        return vragenlijst;
    }

    public void setVragenlijst(ArrayList<String> vragenlijst) {
        Vragen.vragenlijst = vragenlijst;
    }

    public static void InitializeVragen(){
        vragenlijst.add(vraagA);
        vragenlijst.add(vraagB);
        vragenlijst.add(vraagC);
        Collections.shuffle(vragenlijst);
    }

}
