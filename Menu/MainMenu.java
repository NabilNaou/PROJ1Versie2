
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
        //naam = bob    jan
        //ww = bob123   jan123

    public static void StandardAction() {
        String input = userInput.nextLine();
        Keuze(input);
    }
    public static void HoofdMenuText(){
        out.println("Menu");
        out.println(" 1) Lijst met examens");
        out.println(" 2) Lijst met studenten");
        out.println(" 3) Nieuw Inschrijving");
        out.println(" 4) Student Verwijderen");
        out.println(" 5) Examen afnemen");
        out.println(" 6) haal lijst met onvoldoendes op");
        out.println(" 7) haal krijg lijst met voldoendes op");
        out.println(" 8) Krijg de percentage voldoende/onvoldoende");
        out.println(" 9 De student die de meeste examens heeft gehaald");
        out.println(" 10) Haal al de behaalde examens van een specifieke student op");
        out.println(" 11) Haal alle behaalde examens op van de ingelogde gebruiker");
        out.println(" 12) Check of een specifieke student geslaagd is voor een bepaalde examen");
        out.println(" 13) Check ingelogde gebruiker geslaagd is voor een bepaalde examen");
        out.println(" 14) Examen vraag toevoegen");
        out.println(" 15) Print al je cijfers");


        out.println(" 0) Exit");
        out.println("Uw keuze:");
        StandardAction();
    }

    public static void Keuze(String keuze){
  /*      switch (keuze) {
            case "1" -> {
                out.println("Uw kunt een Auto Examen of een Examen Vaarbewijs afnemen.");
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
                out.println("Type 1 voor Multiple choice vragen.");
                out.println("Type 2 voor Open Vragen");
                int beslissing = userInput.nextInt();
                if(beslissing < 1 | beslissing > 2){
                    out.println("Sorry maar dat is geen juiste optie");
                    StandardAction();
                }else{
                    Exam.startExamen(beslissing);
                }
                StandardAction();
            }
            case "6" -> {
                Statistieken statistieken = new Statistieken();
                out.println("haal lijst met onvoldoendes op");
                statistieken.onvoldoendesFilteren();
                StandardAction();
            }
            case "7" -> {
                Statistieken statistieken = new Statistieken();
                out.println("haal krijg lijst met voldoendes op");
                statistieken.voldoendesFilteren();
                StandardAction();
            }
            case "8" -> {
                Statistieken statistieken = new Statistieken();
                out.println("Krijg de percentage voldoende/onvoldoende");
                statistieken.getVoldoendeOnvoldoendeProcent();
                StandardAction();
            }
            case "9" -> {
                Statistieken statistieken = new Statistieken();
                out.println("De student die de meeste examens heeft gehaald");
                statistieken.getStudentMetMeesteExamensGehaald();
                StandardAction();
            }
            case "10" -> {
                Statistieken statistieken = new Statistieken();
                out.println("Haal al de behaalde examens van een specifieke student op");
                statistieken.getAllBehaaldeExamensStudentId();
                StandardAction();
            }
            case "11" -> {
                Statistieken statistieken = new Statistieken();
                out.println("Haal alle behaalde examens op van de ingelogde gebruiker");
                statistieken.getAllBehaaldeExamensStudent();
                StandardAction();
            }
            case "12" -> {
                Statistieken statistieken = new Statistieken();
                out.println("Check of een specifieke student geslaagd is voor een bepaalde examen");
                statistieken.checkExamenGeslaagdStudentId();
                StandardAction();
            }
            case "13" -> {
                Statistieken statistieken = new Statistieken();
                out.println("Check ingelogde gebruiker geslaagd is voor een bepaalde examen");
                statistieken.checkExamenGeslaagdStudentId();
                StandardAction();
            }
            case "14" -> {
                Exam.addVraag();
            }
            case "15" -> {
                int inlogid = Login.getCurrentUser();
                Statistieken.printtoetsenenuitslag(inlogid);
            }
            case "0" -> {
                out.println("Succesfully Exited App...");
                exit(0);
            }


            default -> {
                out.println("Maak een keuze...");
                StandardAction();
            }
        }*/
    }

    public static void main(String[] args) {
        Database.mockdata();
        LoginScherm();
        HoofdMenuText();
    }
}