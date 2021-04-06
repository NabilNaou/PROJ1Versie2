import java.util.ArrayList;

public class CijfersLijst {

    protected static ArrayList<Cijfer> cijferList = new ArrayList<>() {
        {
            add(new Cijfer(5.5, Database.alleExamens.get(1), Database.studentenLijst.get(1)));
            add(new Cijfer(5.6, Database.alleExamens.get(1), Database.studentenLijst.get(2)));
            add(new Cijfer(5.4, Database.alleExamens.get(2), Database.studentenLijst.get(1)));
            add(new Cijfer(5.2, Database.alleExamens.get(2), Database.studentenLijst.get(2)));
        }
    };



    public void addCijfer(Cijfer cijfer){
        cijferList.add(cijfer);
    }

    public static ArrayList<Cijfer> getCijferList(){
        return cijferList;
    }
}