import java.util.ArrayList;

public class Database
{
    public static Student stuLijst;
    public static ArrayList<Student> studentenLijst = new ArrayList<>() {};
    private static ArrayList<Cijfer> cijferList = new ArrayList<>();
    public static Examinator exLijst;
    public static ArrayList<Examinator> examinatorlijst = new ArrayList<>() {{
        add(exLijst = new Examinator(1,"Jan","wild", "jan123"));
        }
    };
    public static ArrayList<Exam> alleExamens = new ArrayList<>();

    public static ArrayList<Student> AutoExamenDeelnemers = new ArrayList<>();
    public static ArrayList<Vraag> AutoExamenCollection = new ArrayList<>();

    public static ArrayList<Vraag> VaarExamenCollection = new ArrayList<>();
    public static ArrayList<Student> VaarExamenDeelnemers = new ArrayList<>();

    public static void addCijfer(Cijfer cijfer){
        cijferList.add(cijfer);
    }
    public static ArrayList<Cijfer> getCijferList(){
        return cijferList;
    }}
