import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Student extends Gebruiker
{
    private static Scanner userInput = new Scanner(in);
    public int studentNummer;

    public Student(int studentNummer, String naam, String achternaam, String wachtwoord) {
        super(naam, achternaam, wachtwoord);
        this.studentNummer = studentNummer;
    }

    // Get all data for every student (id,name,lastname)
    public static void getAllStudents() {
        for (Student student : Database.studentenLijst )
        {
            System.out.println(student.getStudentNummer() + " " + student.getNaam() + " " + student.getAchternaam());
        }
    }

    //Nabil: Zoekt naar de id van een student in een studentenlijst
    public static Student zoekStudentViaID(int studentID){
        for(int i = 0; i < Database.studentenLijst.size(); i++){
            if(Database.studentenLijst.get(i).getStudentNummer() == studentID) {
                return Database.studentenLijst.get(i);
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
        if(alIngeschreven(student)) {
            if (temp == 1) {
                Database.AutoExamenDeelnemers.add(student);
            } else if (temp == 2) {
                Database.VaarExamenDeelnemers.add(student);
            }
        }else{
            System.out.println("Uw bent al ingeschreven voor deze examen.");
        }
        System.out.println(Student.zoekStudentViaID(Login.getCurrentUser()).getNaam() + " is succesvol ingeschreven voor " + temp);
        MainMenu.HoofdMenuText();
    }
    public static boolean alIngeschreven(Student target){
        for(int i = 0; i < Database.AutoExamenDeelnemers.size(); i++){
            if(target.equals(Database.AutoExamenDeelnemers.get(i))|| target.equals(Database.VaarExamenDeelnemers.get(i))){
                return true;
            }
        }return false;
    }

    public static void studentVerwijderen() {
        System.out.println("Welk student wilt u verwijderen?");
        String verwijderen = userInput.nextLine();
        System.out.println("voor welke exame wilt U deze student verwijderen? type 1 voor auto of 2 voor vaar");
        int type = userInput.nextInt();
        if(type == 1){
            for (int i = 0; i < Database.AutoExamenDeelnemers.size(); i++){
                if(verwijderen.equalsIgnoreCase(Database.AutoExamenDeelnemers.get(i).getNaam())){
                    Database.AutoExamenDeelnemers.remove(i);
                    System.out.println(verwijderen + " is verwijderd.");
                    showRemainingStudents(1);
                }
            }
        }else if (type == 2){
            for (int i = 0; i < Database.AutoExamenDeelnemers.size(); i++) {
                Database.VaarExamenDeelnemers.remove(i);
                System.out.println(verwijderen + " is verwijderd.");
                showRemainingStudents(2);
            }
        }
    }

    public static void showRemainingStudents(int type){
        System.out.println("Overblijvende studenten: ");
        if(type == 1) {
            for (int i = 0; i < Database.AutoExamenDeelnemers.size(); i++) {
                System.out.print(Database.AutoExamenDeelnemers.get(i).getNaam() + ", ");
            }
        }else if(type == 2){
            for (int i = 0; i < Database.VaarExamenDeelnemers.size(); i++) {
                System.out.print(Database.VaarExamenDeelnemers.get(i).getNaam() + ", ");
            }
        }
        System.out.println();
        System.out.println("-----------------");
    }
    // New student
    public static void addStudent(Student newStudent){
        Database.studentenLijst.add(newStudent);
    }

    public int getStudentNummer() {
        return studentNummer;
    }
}