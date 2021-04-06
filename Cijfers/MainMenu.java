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
        //naam = bob    jan
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
        out.println(" 5) Examen afnemen");
        out.println(" 6) Is student geslaagd voor test?");
        out.println(" 7) Is student voor het examen geslaagd?");
        out.println(" 8) Student met meeste examens gehaald");
        out.println(" 9) ////");
        out.println(" 0) Exit");
        out.println("Uw keuze:");
        StandardAction();
    }

    public static void Keuze(String keuze){
        switch (keuze) {
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
                out.println("Type 1 voor auto theorie.");
                out.println("Type 2 voor boot theorie. ");
                int beslissing = userInput.nextInt();
                if(beslissing == 1){
                    Exam.startExamen( beslissing);
                }
                StandardAction();
            }
            case "6" -> {
                out.println("Is student geslaagd voor test?");
                StandardAction();
                //TODO: Jarrel: actie aanmaken om te kijken of student boven de voldoende punten staat.
            }
            case "7" -> {
                out.println("Welk exames heeft student gehaald?");
                StandardAction();
                //TODO: Jarrel:
            }
            case "8" -> {
                out.println("Welke student heeft de meeste examens gehaald?");
                Examinator.meesteExames();
                StandardAction();
            }
            case "9" -> {
/*              out.println("Examen Inschrijven");
                Student.nieuweInschrijving();
*/
                out.println();
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