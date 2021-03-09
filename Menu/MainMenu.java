import java.util.Scanner;

public class MainMenu {

    public static void LoginScherm() {
        if (!Login.checkEqual()) {
            Login.checkEqual();
        }
        //student       Examinator
        //naam = Bob    Jan
        //ww = bob123   jan123
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
                Scanner userInput = new Scanner(System.in);
                String input = userInput.nextLine();
                Keuze(input); // Input de keuze
                 }
            case "2" -> {
                if (Login.userInput.equals("examinator") || Login.userInput.equals("Examinator")) {
                    System.out.println("StudentNr - Student");
                    LedenLijst.getAllStudents();
                } else {
                    System.out.println("Unauthorised access");
                }
                Scanner userInput = new Scanner(System.in);
                String input = userInput.nextLine();
                Keuze(input); // Input de keuze
            }
            case "3" -> {
                System.out.println("Nieuw Inschrijving");
                Scanner userInput = new Scanner(System.in);
                String input = userInput.nextLine();
                Keuze(input); // Input de keuze
            }
            case "4" -> {
                System.out.println("Student Verwijderen");
                Scanner userInput = new Scanner(System.in);
                String input = userInput.nextLine();
                Keuze(input); // Input de keuze
            }
            case "5" -> {
                System.out.println("Examen Inschrijven");
                Scanner userInput = new Scanner(System.in);
                String input = userInput.nextLine();
                Keuze(input); // Input de keuze
            }
            case "6" -> {
                System.out.println("Examen afnemen");
                Scanner userInput = new Scanner(System.in);
                String input = userInput.nextLine();
                Keuze(input); // Input de keuze
            }
            case "7" -> {
                System.out.println("Is student geslaagd voor test?");
                Scanner userInput = new Scanner(System.in);
                String input = userInput.nextLine();
                Keuze(input); // Input de keuze
            }
            case "8" -> {
                System.out.println("Is student voor het examen geslaagd?");
                Scanner userInput = new Scanner(System.in);
                String input = userInput.nextLine();
                Keuze(input); // Input de keuze
            }
            case "9" -> {
                System.out.println();
                Scanner userInput = new Scanner(System.in);
                String input = userInput.nextLine();
                Keuze(input); // Input de keuze
            }
            case "0" -> {
                System.out.println("Succesful Exit App...");
                System.exit(0);
            }
            default -> {
                System.out.println("Maak een keuze...");
                Scanner userInput = new Scanner(System.in);
                HoofdMenuText(); // Show Hoofd menu
                String input = userInput.nextLine();
                Keuze(input); // Input de keuze
            }
        }
    }

    public static void main(String[] args) {
        LoginScherm();
        Scanner userInput = new Scanner(System.in);
        HoofdMenuText(); // Show Hoofd menu
        String input = userInput.nextLine();
        Keuze(input); // Input de keuze
    }
}