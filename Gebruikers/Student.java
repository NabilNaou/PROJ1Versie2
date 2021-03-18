import java.util.ArrayList;

public class Student extends Gebruiker {
    public static Student studentLijst;
    private int studentNummer;

    public Student(int studentNummer, String naam, String achternaam, String wachtwoord) {
        super(naam, achternaam, wachtwoord);
        this.studentNummer = studentNummer;
    }

    public static ArrayList<Student> studentenLijst = new ArrayList<>() {
        {
            add(studentLijst = new Student(1,"Bob","Smit", "bob123"));
            add(studentLijst = new Student(2,"Tim","Kapel", "tim123"));
        }
    };

    // Gets all data of every student (id,name,lastname)
    public static ArrayList<Student> getAllStudents() {
        for (Student student : studentenLijst)
        {
            System.out.println(student.getStudentNummer() + " " + student.getNaam() + " " + student.getAchternaam());
        }
        return studentenLijst;
    }

    // Adds new student
    public static void addStudent(Student newStudent){
        Student.studentenLijst.add(newStudent);
    }

    public Integer getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(Integer studentNummer) { this.studentNummer = studentNummer; }

}
