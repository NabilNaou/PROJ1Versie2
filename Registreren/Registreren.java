import java.util.Scanner;

public class Registreren {
    private Boolean isExaminator;
    private LedenLijst lijstLeden;
    public static String userInput;
    public static String userName;
    public static String userSurname;
    public static String userPW;

    public static void Details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voer in uw...");
        System.out.println("naam: ");
        userName = sc.nextLine();
        System.out.println("achternaam: ");
        userSurname = sc.nextLine();
        System.out.println("wachtwoord: ");
        userPW = sc.nextLine();
    }

    public static boolean Registration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Maak een keuze...");
        System.out.println("1) Student");
        System.out.println("2) Examinator");
        userInput = sc.nextLine();

        boolean registrationComplete = false;

        switch (userInput) {
            case "1" -> {
                Details();
                // It's supposed to check the highest value of the id, then do id + 1 and add that to the new user, so there aren't duplicates
                // nor that the new user can assign their own id
                //for (int i = 0; i < LedenLijst.studentenLijst.size(); i++) {

                
                Student newStudent = new Student(1,userName, userSurname, userPW);
                LedenLijst.addStudent(newStudent);
                System.out.println("student geregistreerd");
                //}
                registrationComplete = true;
            }
            case "2" -> {
                Details();
                //for (int i = 0; i < LedenLijst.examinatorLijst.size(); i++) {
                Examinator newEx = new Examinator(1, userName, userSurname, userPW);
                LedenLijst.addEx(newEx);
                System.out.println("examinator geregistreerd");
                //}
                registrationComplete = true;
            }
        }
        System.out.println("Registratie voltooid!");
        return registrationComplete;
    }

    //A function that adds the users

}
