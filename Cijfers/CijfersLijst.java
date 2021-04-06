import java.util.ArrayList;

public class CijfersLijst {
    private ArrayList<Cijfer> cijferList = new ArrayList<>();
    public void addCijfer(Cijfer cijfer){
        cijferList.add(cijfer);
    }
    public double getcijfer(String name) {
        double cijfer;
        for (Cijfer value : cijferList) {
            if (name.equalsIgnoreCase(value.getExamenNaam())) {
                cijfer = value.getCijfer();
                return cijfer;
            }
        }
        return 0;
    }
    public void removeCijfer(Cijfer cijfer){
        cijferList.remove(cijfer);
    }
    public ArrayList<Cijfer> getCijferList(){
        return cijferList;
    }
}