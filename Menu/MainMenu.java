import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class MainMenu {
    private static Scanner userInput = new Scanner(in);

    public static void LoginScherm() {
        if (Login.chooseLogin())
        {
            HoofdMenuText();
        }
        else {
            LoginScherm();
        }
    }
        //student       Examinator
        //naam = Bob    Jan
        //ww = bob123   jan123

    public static void StandardAction() {
        String input = userInput.nextLine();
        Keuze(input); // Input de keuze
    }
    public static void HoofdMenuText(){
        out.println("Menu");
        out.println(" 1) Lijst met examens");
        out.println(" 2) Lijst met studenten");
        out.println(" 3) Nieuw Inschrijving");
        out.println(" 4) Student Verwijderen");
        out.println(" 5) Examen Inschrijven");
        out.println(" 6) Examen afnemen");
        out.println(" 7) Is student geslaagd voor test?");
        out.println(" 8) Is student voor het examen geslaagd?");
        out.println(" 9) Student met meeste examens gehaald");
        out.println(" 10) lijst met alle onvoldoendes");
        out.println(" 11) lijst met alle voldoendes");
        out.println(" 12) percentage Voldoendes/onvoldoendes");
        out.println(" 0) Exit");
        out.println("Uw keuze:");
        StandardAction();
    }

    public static void Keuze(String keuze){
        switch (keuze) {
            case "1" -> {
                out.println("Uw examenlijst...");
                //TODO: Josue
                StandardAction();
                 }
            case "2" -> {
                if (Login.userInput.equals("2")) {
                    out.println("StudentNr - Student");
                    Student.getAllStudents();
                } else {
                    out.println("Unauthorised access");
                    Student.getAllStudents();
                }
                StandardAction();
            }
            case "3" -> {
                out.println("Nieuw Student Inschrijving");
                Student.nieuweInschrijving();
            }
            case "4" -> {
                out.println("Student Verwijderen");
                Student.studentVerwijderen();
            }
            case "5" -> {
                out.println("Welk examen wilt u afnemen?");
                out.println("Type 1 voor auto theorie.");
                out.println("Type 2 voor boot theorie. ");
                int beslissing = userInput.nextInt();
                if(beslissing == 1){
                    //TODO: Josue: actie aanmaken om de examen te starten.
                }
                StandardAction();
            }
            case "6" -> {
                out.println("Is student geslaagd voor test?");
                StandardAction();

            }
            case "8" -> {
                out.println("Welk exmanes heeft een specifieke student gehaald?");
                Statistieken statistieken = new Statistieken();
                statistieken.getAllBehaaldeExamensStudentId();
                StandardAction();

            }
            case "9" -> {
                out.println("Welke examens heb ik(student) gehaald?");
                Statistieken statistieken = new Statistieken();
                statistieken.getAllBehaaldeExamensStudent();
                StandardAction();
            }
            case "10" -> {
                out.println("Is student voor examen geslaagd?");

                StandardAction();
            }
            case "11" -> {
              out.println("Student met meeste examens gehaald");
                Statistieken statistieken = new Statistieken();
                statistieken.getStudentMetMeesteExamensGehaald();
                StandardAction();
            }

            case "12" -> {
                out.println("lijst met alle onvoldoendes");
                Statistieken statistieken = new Statistieken();
                statistieken.onvoldoendesFilteren();
                StandardAction();
            }
            case "13" -> {
                out.println("lijst met alle voldoendes");
                Statistieken statistieken = new Statistieken();
                statistieken.voldoendesFilteren();
                StandardAction();
            }
            case "14" -> {
                out.println("percentage Voldoendes/onvoldoendes");
                Statistieken statistieken = new Statistieken();
                statistieken.getVoldoendeOnvoldoendeProcent();
                StandardAction();
            }
            case "15" -> {
                out.println("Heb ik(student) een bepaalde examen gehaald?");
                Statistieken statistieken = new Statistieken();
                statistieken.checkExamenGeslaagdStudent();
                StandardAction();
            }
            case "16" -> {
                out.println("Heeft een specifieke student een bepaalde examen gehaald?");
                Statistieken statistieken = new Statistieken();
                statistieken.checkExamenGeslaagdStudentId();
                StandardAction();
            }

            case "0" -> {
                out.println("Succesfully Exited App...");
                exit(0);
            }
            default -> {
                out.println("Maak een keuze...");
                StandardAction();
            }
        }
    }

    public static void main(String[] args) {
        LoginScherm();
        HoofdMenuText(); // Show Hoofd menu
        //StandardAction();
    }
}