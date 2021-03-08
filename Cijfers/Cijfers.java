import java.util.ArrayList;

public class Cijfers {
    public static Cijfers lijst;

    public static ArrayList<Cijfers> CijferLijst = new ArrayList<>() {
        {
            add(lijst = new Cijfers());
            add(lijst = new Cijfers());
        }
    };
}
