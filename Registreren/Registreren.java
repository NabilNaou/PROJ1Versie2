import java.util.Scanner;

public class Registreren {
    private Boolean isExaminator;
    private LedenLijst lijstLeden;
    public static int userID;
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
                userID = LedenLijst.studentenLijst.size()+1;
                Student newStudent = new Student(userID,userName, userSurname, userPW);
                LedenLijst.addStudent(newStudent);
                LedenLijst.getAllStudents();
                System.out.println("student geregistreerd");
                //}
                registrationComplete = true;
            }
            case "2" -> {
                Details();
                userID = LedenLijst.examinatorLijst.size()+1;
                Examinator newEx = new Examinator(userID, userName, userSurname, userPW);
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