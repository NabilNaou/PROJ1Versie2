import java.util.ArrayList;

public class Student {
    public static Student studentLijst;
    private int Id;
    private String naam;
    private String achternaam;
    private String wachtwoord;

    public Student(int Id, String naam, String achternaam, String wachtwoord) {
        this.Id = Id;
        this.naam = naam;
        this.achternaam = achternaam;
        this.wachtwoord = wachtwoord;
    }

    public static ArrayList<Student> studentenLijst = new ArrayList<>() {
        {
            add(studentLijst = new Student(1,"Bob","Smit", "bob123"));
            add(studentLijst = new Student(2,"Tim","Kapel", "tim123"));
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

    // New student
    public static void addStudent(Student newStudent){
        Student.studentenLijst.add(newStudent);
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) { Id = id; }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }
}
