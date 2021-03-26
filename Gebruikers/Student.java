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

    //Nabil: Weg gecomment, errors.
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


    //Nabil: Zoekt naar een student in een studentenlijst (Hun ID)
    public static Student zoekStudent(int studentID){
        for(int i = 0; i < studentenLijst.size(); i++){
            if(studentenLijst.get(i).getId() == studentID) {
                return studentenLijst.get(i);
            }
        }
        return null;
    }

    // Returnt hele lijst met studenten
    public static ArrayList<Student> getStudentenLijst() { return studentenLijst; }

    //Nabil: Student kan zich inschrijven voor examen
    public static void nieuweInschrijving() {
        System.out.println("Voor welk examen wilt u zich inschrijven?");
        Exam exam = new Exam("Wiskunde");
        String temp = userInput.nextLine();
        System.out.println(Student.zoekStudent(Login.getCurrentUser()));
        if(Exam.zoekExamen(temp) != null){
            Exam.zoekExamen(temp).addDeelnemer(Student.zoekStudent(Login.getCurrentUser()));
            //Error omdat er geen current user is, wel functioneel.
            System.out.println(Student.zoekStudent(Login.getCurrentUser()).getNaam() + " is succesvol ingeschreven voor " + temp);
        }
        else{
            System.out.println("Dit examen is niet gevonden");
        }
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