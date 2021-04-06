import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Student extends Gebruiker
{
    private static Scanner userInput = new Scanner(in);
    public static Database database;
    protected CijfersLijst persoonlijkeCijferlijst;

    public void getPersoonlijkeCijferlijst() {
        ArrayList<Double> lijst = persoonlijkeCijferlijst.getcijfer();
        for(int i = 0; i < lijst.size(); i++){
            System.out.println(lijst.get(i));
        }

    }



    public Student(int id, String naam, String achternaam, String wachtwoord) {
        super(id, naam, achternaam, wachtwoord);
        persoonlijkeCijferlijst = new CijfersLijst();
    }





    // Get all data for every student (id,name,lastname)
    public static void getAllStudents() {
        for (Student student : database.Studentenlijst )
        {
            System.out.println(student.getId() + " " + student.getNaam() + " " + student.getAchternaam());
        }
    }

    //Nabil: Zoekt naar de id van een student in een studentenlijst
    public static Student zoekStudentViaID(int studentID){
        for(int i = 0; i < database.Studentenlijst.size(); i++){
            if(database.Studentenlijst.get(i).getId() == studentID) {
                return database.Studentenlijst.get(i);
            }
        }
        return null;
    }

    //Nabil: Student kan zich inschrijven voor examen. Student word geïnformeerd over inschrijving.
    public static void nieuweInschrijving() {
        System.out.println("Voor welk examen wilt u zich inschrijven?");
        Exam exam = new Exam("type 1 voor AutoExamen of 2 voor VaarExamen");
        Student student = zoekStudentViaID(Login.getCurrentUser());
        int temp = userInput.nextInt();
        if(temp == 1){
            database.AutoExamenDeelnemers.add(student);
        }else if ( temp == 2){
            database.VaarExamenDeelnemers.add(student);
        }
        System.out.println(Student.zoekStudentViaID(Login.getCurrentUser()).getNaam() + " is succesvol ingeschreven voor " + temp);
        MainMenu.HoofdMenuText();
    }

    public void addcijfer(Cijfer cijfer){
        Student student = zoekStudentViaID(Login.getCurrentUser());
        student.persoonlijkeCijferlijst.addCijfer(cijfer);
    }
    public static void studentVerwijderen() {
        System.out.println("Welk student wilt u verwijderen?");
        String verwijderen = userInput.nextLine();
        System.out.println("voor welke exame wilt U deze student verwijderen? type 1 voor auto of 2 voor vaar");
        int type = userInput.nextInt();
        if(type == 1){
            for (int i = 0; i < database.AutoExamenDeelnemers.size(); i++){
                if(verwijderen.equalsIgnoreCase(database.AutoExamenDeelnemers.get(i).getNaam())){
                    database.AutoExamenDeelnemers.remove(i);
                    System.out.println(verwijderen + " is verwijderd.");
                    showRemainingStudents(1);
                }
            }
        }else if (type == 2){
            for (int i = 0; i < database.AutoExamenDeelnemers.size(); i++) {
                database.VaarExamenDeelnemers.remove(i);
                System.out.println(verwijderen + " is verwijderd.");
                showRemainingStudents(2);
            }
        }
    }

    public static void showRemainingStudents(int type){
        System.out.println("Overblijvende studenten: ");
        if(type == 1) {
            for (int i = 0; i < database.AutoExamenDeelnemers.size(); i++) {
                System.out.print(database.AutoExamenDeelnemers.get(i).getNaam() + ", ");
            }
        }else if(type == 2){
            for (int i = 0; i < database.VaarExamenDeelnemers.size(); i++) {
                System.out.print(database.VaarExamenDeelnemers.get(i).getNaam() + ", ");
            }
        }
        System.out.println();
        System.out.println("-----------------");
    }
    // New student
    public static void addStudent(Student newStudent){
        database.Studentenlijst.add(newStudent);
    }
}