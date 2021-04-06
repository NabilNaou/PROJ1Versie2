import java.util.ArrayList;

public class Database {

    public static ArrayList<Student> Studentenlijst = new ArrayList<>();
    public static ArrayList<Examinator> Examinatorlijst = new ArrayList<>();
    public static ArrayList<Exam> alleExamens = new ArrayList<>();
    public static ArrayList<Student> AutoExamenDeelnemers = new ArrayList<>();
    public static ArrayList<Student> VaarExamenDeelnemers = new ArrayList<>();


    public static void mockdata() {
               Studentenlijst.add( new Student(1,"bob","Smit", "bob123"));
               Studentenlijst.add( new Student(2,"tim","Kapel", "tim123"));
            }
}