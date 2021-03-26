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


    public static ArrayList<Student> studentenLijst = new ArrayList<>();
        /*{
            add(stuLijst = new Student(1,"Bob","Smit", "bob123"));
            add(stuLijst = new Student(2,"Tim","Kapel", "tim123"));
        }*/

    // Get all data for every student (id,name,lastname)
    public static void getAllStudents() {
        for (Student student : studentenLijst)
        {
            System.out.println(student.getId() + " " + student.getNaam() + " " + student.getAchternaam());
        }
    }

    // Get specific element
    public static ArrayList<Student> getStudentenLijst() { return studentenLijst; }

    public static void nieuweInschrijving() {
        System.out.println("Voor welk examen wilt u zich inschrijven?");

    }

    public static void studentVerwijderen() {
        System.out.println("Welk student wilt u verwijderen?");
        String verwijderen = userInput.nextLine();
        for (int i = 0; i < studentenLijst.size(); i++){
            if (studentenLijst.get(i).getNaam().equalsIgnoreCase(verwijderen)){
                studentenLijst.remove(i);
                System.out.println(verwijderen + " is verwijderd");
                showAllStudents();
            }
            else {
                System.out.println(verwijderen + " is niet geregistreerd");
                showAllStudents();
            }
        }
    }

    public static void showAllStudents(){
        System.out.println("Overblijvende studenten: ");
        for (int i = 0; i < studentenLijst.size(); i++) {
            System.out.print(studentenLijst.get(i).getNaam() + ", ");

        }
        System.out.println();
        System.out.println("-----------------");
    }
    // New student
    public static void addStudent(Student newStudent){
        studentenLijst.add(newStudent);
    }
}