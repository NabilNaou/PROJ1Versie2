import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Vraag{
    private static int ID = 0;
    public String description;
    public ArrayList<String> antwoorden = new ArrayList<>();

    public Vraag(){
        ID = newID();
    }
    public Integer newID(){       ID++;
        return ID;
    }
}