import java.util.ArrayList;

public class CijfersLijst {
    protected static ArrayList<Cijfer> cijferList = new ArrayList<>();
    public void addCijfer(Cijfer cijfer){
        cijferList.add(cijfer);
    }
    public ArrayList<Double> getcijfer() {
        ArrayList<Double> lijst = new ArrayList<Double>();
        Cijfer cijfer = null;
        for(int i = 0; i < cijferList.size(); i++){
            lijst.add(cijfer.getCijfer());
            }return lijst;
        }

    public void removeCijfer(Cijfer cijfer){
        cijferList.remove(cijfer);
    }
    public static ArrayList<Cijfer> getCijferList(){
        return cijferList;
    }
}