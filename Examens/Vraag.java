import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Vraag{
    private static int ID = 0;
    public String description;
    public ArrayList<String> antwoorden = new ArrayList<>();
    public String antwoord;

    public Vraag(){
        ID = newID();
    }

    public Vraag(String Vraag, String ant_a, String ant_b, String ant_c, String correcte_antwoord) {
        ID = newID();
        this.description = Vraag;
        antwoorden.add(ant_a);
        antwoorden.add(ant_b);
        antwoorden.add(ant_c);
        this.antwoord = correcte_antwoord;
    }
    public  Vraag(String vraag, String antwoord){
        ID= newID();
        this.description = vraag;
        this.antwoord = antwoord;
    }



    public Integer newID(){       ID++;
        return ID;
    }
}