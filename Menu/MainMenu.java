import java.util.Scanner;

public class MainMenu {

    public static void LoginScherm() {
        if (!Login.checkEqual()) {
            System.out.println("Log in alstublieft");
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
                 }
            case "2" -> {
                System.out.println();
            }
            case "3" -> System.out.println();
            case "4" -> System.out.println();
            case "5" -> System.out.println();
            case "6" -> System.out.println();
            case "7" -> System.out.println();
            case "8" -> System.out.println();
            case "9" -> System.out.println();
            case "0" -> {
                System.out.println("Succesful Exit App...");
                System.exit(0);
            }
            default -> System.out.println("Niets Gekozen...");
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