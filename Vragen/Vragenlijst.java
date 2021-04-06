import java.util.ArrayList;
import java.util.Collections;

public class Vragenlijst {


    private static ArrayList<Vraag> AutoCollection = new ArrayList<>();
    private static ArrayList<Vraag> BotenCollection = new ArrayList<>();


    public ArrayList<Vraag> GetAutovragenlijst() {
        return AutoCollection;
    }
    public ArrayList<Vraag> GetBotenCollection() {
        return BotenCollection;
    }
    public Vraag getvraag(int a){
        return AutoCollection.get(a);
    }

    public void Addvraag(int a, Vraag vraag) {
        if( a == 1) {
            AutoCollection.add(vraag);
        }else{
            BotenCollection.add(vraag);
        }
    }

    public void removeQuestionByID(int a, Integer ID) {
        if( a == 1) {
            AutoCollection.removeIf(vraag -> ID.equals(vraag.getID()));
        }else{
            BotenCollection.removeIf(vraag -> ID.equals(vraag.getID()));
        }
    }

    public ArrayList<Vraag> shufflelijst(ArrayList a) {
        ArrayList<Vraag> Test = new ArrayList<Vraag>();
        Test = a;
        Collections.shuffle(Test);
        return Test;
    }
    public void MockDataBase() {
        Addvraag(1,new Vraag("test1", "ant a", "ant b", "ant c", "correcte antwoord"));
        Addvraag(1,new Vraag("test2", "ant a", "ant b", "ant c", "correcte antwoord"));
        Addvraag(1,new Vraag("test3", "ant a", "ant b", "ant c", "correcte antwoord"));
        Addvraag(1,new Vraag("test4", "ant a", "ant b", "ant c", "correcte antwoord"));
        Addvraag(1,new Vraag("test5", "ant a", "ant b", "ant c", "correcte antwoord"));
        Addvraag(1,new Vraag("test6", "ant a", "ant b", "ant c", "correcte antwoord"));
        Addvraag(1,new Vraag("test7", "ant a", "ant b", "ant c", "correcte antwoord"));
        Addvraag(1,new Vraag("test8", "ant a", "ant b", "ant c", "correcte antwoord"));
        Addvraag(1,new Vraag("test9", "ant a", "ant b", "ant c", "correcte antwoord"));
        Addvraag(1,new Vraag("test0", "ant a", "ant b", "ant c", "correcte antwoord"));
        shufflelijst(AutoCollection);
    }
}


