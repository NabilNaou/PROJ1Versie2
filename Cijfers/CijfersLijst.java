import java.util.ArrayList;

public class CijfersLijst {
    private static ArrayList<Cijfer> cijferList = new ArrayList<>();
    public void addCijfer(Cijfer cijfer){
        cijferList.add(cijfer);
    }
    public ArrayList<Double> getcijfer(Exam exam, Student student) {
        double cijfer;
        ArrayList<Double> lijst = new ArrayList<Double>();
        for(int i = 0; i < cijferList.size(); i++){
            if(student.equals(cijferList.get(i))){
                lijst.add(cijferList.get(i).getCijfer());
            }
        }return lijst;
    }
    public void removeCijfer(Cijfer cijfer){
        cijferList.remove(cijfer);
    }
    public static ArrayList<Cijfer> getCijferList(){
        return cijferList;
    }
}