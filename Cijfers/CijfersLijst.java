import java.util.ArrayList;

public class CijfersLijst {
    private static ArrayList<Cijfer> cijferList = new ArrayList<>();
    public void addCijfer(Cijfer cijfer){
        cijferList.add(cijfer);
    }
    public int getcijfer(String name) {
        int cijfer;
        for (Cijfer value : cijferList) {
            if (name.equalsIgnoreCase(value.getExamenNaam())) {
                cijfer = (int) value.getCijfer();
                return cijfer;
            }
        }
        return 0;
    }
    public void removeCijfer(Cijfer cijfer){
        cijferList.remove(cijfer);
    }
    public static ArrayList<Cijfer> getCijferList(){
        return cijferList;
    }
}