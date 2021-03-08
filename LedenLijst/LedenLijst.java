import java.util.ArrayList;

public class LedenLijst {
    public static Student lijst;

    public static ArrayList<Student> StudentenLijst = new ArrayList<>() {
        {
            add(lijst = new Student(1,"Bob","Smit", "bob123"));
            add(lijst = new Student(2,"Tim","Kapel", "tim123"));
        }
    };
}
