import java.util.ArrayList;

public class Database {

    public static Student stuLijst;

    public static ArrayList<Student> studentenLijst = new ArrayList<>() {
        {
            add(stuLijst = new Student(1,"bob","Smit", "bob123"));
            add(stuLijst = new Student(2,"tim","Kapel", "tim123"));
        }
    };

    public static ArrayList<Examinator> examinatorlijst = new ArrayList<>();
    public static ArrayList<Exam> alleExamens = new ArrayList<>();
    public static ArrayList<Student> AutoExamenDeelnemers = new ArrayList<>();
    public static ArrayList<Student> VaarExamenDeelnemers = new ArrayList<>();



}
