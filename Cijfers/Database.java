import java.util.ArrayList;

public class Database {

    public static Student stuLijst;

    public static ArrayList<Student> studentenLijst = new ArrayList<>() {
        {
            add(stuLijst = new Student(1,"bob","Smit", "bob123"));
            add(stuLijst = new Student(2,"tim","Kapel", "tim123"));
        }
    };

    private static ArrayList<Cijfer> cijferList = new ArrayList<>();

    public static Examinator exLijst;

    public static ArrayList<Examinator> examinatorlijst = new ArrayList<>() {
        {
            add(exLijst = new Examinator(1,"Jan","wild", "jan123"));
        }
    };

    //public static ArrayList<Examinator> examinatorlijst = new ArrayList<>();
    public static ArrayList<Exam> alleExamens = new ArrayList<>();
    public static ArrayList<Student> AutoExamenDeelnemers = new ArrayList<>();
    public static ArrayList<Student> VaarExamenDeelnemers = new ArrayList<>();

    public static void addCijfer(Cijfer cijfer){
        cijferList.add(cijfer);
    }

    public static ArrayList<Cijfer> getCijferList(){
        return cijferList;
    }


}

/*public class Database {

    public static Student stuLijst;

    public static ArrayList<Student> studentenLijst = new ArrayList<>() {
        {
            add(stuLijst = new Student(1,"bob","Smit", "bob123"));
            add(stuLijst = new Student(2,"tim","Kapel", "tim123"));
        }
    };

    public static ArrayList<Exam> alleExamens = new ArrayList<>() {
        {
            add(new Exam("auto"));
            add(new Exam("boot"));
        }
    };

    private static ArrayList<Cijfer> cijferList = new ArrayList<>() {
        {
            add(new Cijfer(5.5, alleExamens.get(1), studentenLijst.get(1)));
            add(new Cijfer(5.4, alleExamens.get(1), studentenLijst.get(2)));
            add(new Cijfer(5.6, alleExamens.get(2), studentenLijst.get(1)));
            add(new Cijfer(5.2, alleExamens.get(2), studentenLijst.get(2)));
        }
    };

    public static ArrayList<Examinator> examinatorlijst = new ArrayList<>();

    public static ArrayList<Student> AutoExamenDeelnemers = new ArrayList<>();
    public static ArrayList<Student> VaarExamenDeelnemers = new ArrayList<>();



    public static void addCijfer(Cijfer cijfer){
        cijferList.add(cijfer);
    }

    public static ArrayList<Cijfer> getCijferList(){
        return cijferList;
    }



}*/
