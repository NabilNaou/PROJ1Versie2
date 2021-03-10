import java.util.Scanner;

public class MainMenu {

    public static void LoginScherm() {
        LedenLijst.getAllStudents();
        if (Login.chooseLogin()) {
            while (!Login.checkEqual()) {
                Login.checkEqual();
                LedenLijst.getAllStudents();
            }
            if (Login.checkEqual()) {
                HoofdMenuText();
                LedenLijst.getAllStudents();
            }
        } else if (!Login.chooseLogin()) {
            Registreren.Registration();
//            if (Registreren.Registration()) {
//                HoofdMenuText();
//            }
        }
        //student       Examinator
        //naam = Bob    Jan
        //ww = bob123   jan123
        LedenLijst.getAllStudents();
    }

    public static void StandardAction() {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        Keuze(input); // Input de keuze
    }
    public static void HoofdMenuText(){
        System.out.println("Menu");
        System.out.println(" 1) Lijst met examens");
        System.out.println(" 2) Lijst met studenten");
        System.out.println(" 3) Nieuw Inschrijving");
        System.out.println(" 4) Student Verwijderen");
        System.out.println(" 5) Examen Inschrijven");
        System.out.println(" 6) Examen afnemen");
        System.out.println(" 7) Is student geslaagd voor test?");
        System.out.println(" 8) Is student voor het examen geslaagd?");
        System.out.println(" 9) Student met meeste exmans gehaald");
        System.out.println(" 0) Exit");
        System.out.println("Uw keuze:");
    }

    public static void Keuze(String keuze){
        switch (keuze) {
            case "1" -> {
                System.out.println("Uw examenlijst...");
                StandardAction();
                 }
            case "2" -> {
                if (Login.userInput.equals("examinator") || Login.userInput.equals("Examinator")) {
                    System.out.println("StudentNr - Student");
                    LedenLijst.getAllStudents();
                } else {
                    System.out.println("Unauthorised access");
                }
                StandardAction();
            }
            case "3" -> {
                System.out.println("Nieuw Inschrijving");
                StandardAction();
            }
            case "4" -> {
                System.out.println("Student Verwijderen");
                StandardAction();
            }
            case "5" -> {
                System.out.println("Examen Inschrijven");
                StandardAction();
            }
            case "6" -> {
                System.out.println("Examen afnemen");
                StandardAction();
            }
            case "7" -> {
                System.out.println("Is student geslaagd voor test?");
                StandardAction();
            }
            case "8" -> {
                System.out.println("Is student voor het examen geslaagd?");
                StandardAction();
            }
            case "9" -> {
                System.out.println();
                StandardAction();
            }
            case "0" -> {
                System.out.println("Succesfull Exit App...");
                System.exit(0);
            }
            default -> {
                System.out.println("Maak een keuze...");
                StandardAction();
            }
        }
    }

    public static void main(String[] args) {
        LoginScherm();
        //HoofdMenuText(); // Show Hoofd menu
        //StandardAction();
    }
}