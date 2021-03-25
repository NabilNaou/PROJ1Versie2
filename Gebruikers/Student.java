import java.util.ArrayList;

public class Student extends Gebruiker
{
    private ArrayList<String> Resultaten; //TODO: type veranderen naar Examens zodat je een betere resultaat overzicht kan maken.

    public Student(int id, String naam, String achternaam, String wachtwoord) {
        super(id, naam, achternaam, wachtwoord);
    }

    public void addResultaat(String resultaat){
        Resultaten.add(resultaat);
    }

    public static Student stuLijst;


    public static ArrayList<Student> studentenLijst = new ArrayList<>() {
        {
            add(stuLijst = new Student(1,"Bob","Smit", "bob123"));
            add(stuLijst = new Student(2,"Tim","Kapel", "tim123"));
        }
    };

    // Get all data for every student (id,name,lastname)
    public static void getAllStudents() {
        for (Student student : studentenLijst)
        {
            System.out.println(student.getId() + " " + student.getNaam() + " " + student.getAchternaam());
        }
    }

    // Get specific element
    public static ArrayList<Student> getStudentenLijst() { return studentenLijst; }

    // New student
    public static void addStudent(Student newStudent){
        studentenLijst.add(newStudent);
    }
}