import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Student extends Gebruiker
{
    private static Scanner userInput = new Scanner(in);

    public CijfersLijst getPersoonlijkeCijferlijst() {
        return persoonlijkeCijferlijst;
    }

    protected CijfersLijst persoonlijkeCijferlijst = new CijfersLijst();

    public Student(int id, String naam, String achternaam, String wachtwoord) {
        super(id, naam, achternaam, wachtwoord);
    }


    public static Student stuLijst;


    public static ArrayList<Student> studentenLijst = new ArrayList<>() {
        {
            add(stuLijst = new Student(1,"bob","Smit", "bob123"));
            add(stuLijst = new Student(2,"tim","Kapel", "tim123"));
        }
    };

    // Get all data for every student (id,name,lastname)
    public static void getAllStudents() {
        for (Student student : studentenLijst)
        {
            System.out.println(student.getId() + " " + student.getNaam() + " " + student.getAchternaam());
        }
    }

    //Nabil: Zoekt naar de id van een student in een studentenlijst
    public static Student zoekStudentViaID(int studentID){
        for(int i = 0; i < studentenLijst.size(); i++){
            if(studentenLijst.get(i).getId() == studentID) {
                return studentenLijst.get(i);
            }
        }
        return null;
    }

    // Returned hele lijst met studenten
    public static ArrayList<Student> getStudentenLijst() { return studentenLijst; }

    //Nabil: Student kan zich inschrijven voor examen. Student word geïnformeerd over inschrijving.
    public static void nieuweInschrijving() {
        System.out.println("Voor welk examen wilt u zich inschrijven?");
        Exam exam = new Exam("Wiskunde");
        String temp = userInput.nextLine();
        System.out.println(zoekStudentViaID(Login.getCurrentUser()));
        if(Exam.zoekExamen(temp) != null){
            Exam.zoekExamen(temp).addDeelnemer(zoekStudentViaID(Login.getCurrentUser()));
            System.out.println(Student.zoekStudentViaID(Login.getCurrentUser()).getNaam() + " is succesvol ingeschreven voor " + temp);
        }
        else{
            System.out.println("Dit examen is niet gevonden");
        }
        MainMenu.HoofdMenuText();
    }
    public void addcijfer(Cijfer cijfer){
        persoonlijkeCijferlijst.addCijfer(cijfer);
    }
    public static void studentVerwijderen() {
        System.out.println("Welk student wilt u verwijderen?");
        String verwijderen = userInput.nextLine();
        for (int i = 0; i < studentenLijst.size(); i++){
            if (studentenLijst.get(i).getNaam().equalsIgnoreCase(verwijderen)){
                studentenLijst.remove(i);
                System.out.println(verwijderen + " is verwijderd");
                showRemainingStudents();
            }
            else {
                System.out.println(verwijderen + " is niet geregistreerd");
                showRemainingStudents();
            }
        }
    }


    public static void showRemainingStudents(){
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