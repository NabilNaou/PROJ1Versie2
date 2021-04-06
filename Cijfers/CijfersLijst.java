import java.util.ArrayList;

public class CijfersLijst {
    protected static ArrayList<Cijfer> cijferList = new ArrayList<>();

    public void addCijfer(Cijfer cijfer){
        cijferList.add(cijfer);
    }

    public static ArrayList<Cijfer> getCijferList(){
        return cijferList;
    }
}