import java.util.Scanner;

public class MainMenu {
    public static void HoofdMenuText(){
        System.out.println("Menu");
        System.out.println(" 1) Lijst met examens");
        System.out.println(" 2) Lijst met studenten");
        System.out.println(" 3) Nieuw studenten inschrijven");
        System.out.println(" 4) Student Verwijderen");
        System.out.println(" 5) Examen afnemen");
        System.out.println(" 6) Is student geslaagd voor test?");
        System.out.println(" 7) Welke student heeft de meeste examens gehaald?");
        System.out.println(" 0) Exit");
        System.out.println("Uw keuze:");
    }

    public static void Keuze(String keuze){
        switch (keuze) {
            case "0" -> System.out.println("Succesful Exit App...");
            case "2" -> System.out.println("Menu selectie 2 werkt nog niet");
            default -> System.out.println("Niks Gekozen");
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        HoofdMenuText(); // Show Hoofd menu
        String input = userInput.nextLine();
        Keuze(input); // Input de keuze
    }
}