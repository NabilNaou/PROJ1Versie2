import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class LedenLijst {
    public static Student lijst;
    public static Examinator exLijst;

    public static ArrayList<Student> studentenLijst = new ArrayList<>() {
        {
            add(lijst = new Student(1,"Bob","Smit", "bob123"));
            add(lijst = new Student(2,"Tim","Kapel", "tim123"));
        }
    };

    public static ArrayList<Examinator> examinatorLijst = new ArrayList<>() {
        {
            add(exLijst = new Examinator(1,"Jan","Wild", "jan123"));
        }
    };

    // Get all data for every student (id,name,lastname)
    public static ArrayList<Student> getAllStudents() {
        for (Student student : studentenLijst)
        {
            System.out.println(student.getId() + " " + student.getNaam() + " " + student.getAchternaam());
        }
        return studentenLijst;
    }

    // Get all data for every student
    public static ArrayList<Student> getAllExaminators() {
        for (Examinator examinator : examinatorLijst)
        {
            System.out.println(examinator.getId() + " " + examinator.getNaam() + " " + examinator.getAchternaam());
        }
        return studentenLijst;
    }

    // Get specific element
    public static ArrayList<Student> getStudentenLijst() { return studentenLijst; }
    public static ArrayList<Examinator> getExaminatorLijst() { return examinatorLijst; }

    // New student
    public static void addStudent(Student newStudent){
        LedenLijst.studentenLijst.add(newStudent);
    }

    public static void addEx(Examinator newEx){
        LedenLijst.examinatorLijst.add(newEx);
    }


//    public static String getUser(Student target) {
//        for (Student index : studentenLijst) {
//            if (index.equals(target)) {
//                return index.naam;
//            }
//        }
//        return "user is not registered.";
//    }
//    public static String getPassword(Student target) {
//        for (Student index : studentenLijst) {
//            if (index.equals(target)) {
//                return index.wachtwoord;
//            }
//        }
//        return "user is not registered.";
//    }
}
