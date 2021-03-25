import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Student extends Gebruiker
{
    private static Scanner userInput = new Scanner(in);
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

    public static void NieuweInschrijving() {
        System.out.println("Voer uw ID, Naam, Achternaam en Wachtwoord in..");
    }

    public static void StudentVerwijderen() {
        System.out.println("Welk student wilt u verwijderen?");
        String verwijderen = userInput.nextLine();
        for (int i = 0; i < studentenLijst.size(); i++){
            if (studentenLijst.contains(verwijderen)){
                studentenLijst.remove(verwijderen);
                System.out.println(verwijderen + " is verwijdert");
            }
            else {
                System.out.println(verwijderen + " is niet geregistreerd");
            }
        }
    }

    // New student
    public static void addStudent(Student newStudent){
        studentenLijst.add(newStudent);
    }
}