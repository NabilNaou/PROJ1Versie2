import java.util.ArrayList;

public class CijfersLijst {
    private ArrayList<Cijfer> cijferList = new ArrayList<>();
    public void addCijfer(Cijfer cijfer){
        cijferList.add(cijfer);
    }
    public void removeCijfer(Cijfer cijfer){
        cijferList.remove(cijfer);
    }
    public ArrayList<Cijfer> getCijferList(){
        return cijferList;
    };
}