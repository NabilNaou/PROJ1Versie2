import java.util.ArrayList;

public class LedenLijst {
    public static Student lijst;

    public static ArrayList<Student> studentenLijst = new ArrayList<>() {
        {
            add(lijst = new Student(1,"Bob","Smit", "bob123"));
            add(lijst = new Student(2,"Tim","Kapel", "tim123"));
        }
    };

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
