import java.util.ArrayList;
import java.util.Collections;

public class Vragen
{

        private String name;
        //private int testPeriod;
        private ArrayList<Vraag> vraagCollection = new ArrayList<>();

    public Vragen(String name) {
            this.name = name;
            //this.testPeriod = testPeriod;
        }

        public ArrayList<Vraag> getVraagCollection() {
            return vraagCollection;
        }

        public void addQuestionTest(Vraag vraag) {
            vraagCollection.add(vraag);
        }

        public void removeQuestionByID(Integer ID) {
            vraagCollection.removeIf(vraag -> ID.equals(vraag.getID()));
        }

        public ArrayList<Vraag> getShuffledTest()
        {
            ArrayList<Vraag> Test = new ArrayList<Vraag>();
            Test = vraagCollection;
            Collections.shuffle(Test);
            return Test;
        }
}


