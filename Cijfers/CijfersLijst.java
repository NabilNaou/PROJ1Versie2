import java.util.ArrayList;

public class CijfersLijst {
    public static CijfersLijst lijst;

    //N: Cijferlijst
    public static ArrayList<CijfersLijst> CijferLijst = new ArrayList<>() {
        {
            add(lijst = new CijfersLijst());
            add(lijst = new CijfersLijst());
        }
    };
}