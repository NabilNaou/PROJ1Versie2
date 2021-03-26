import java.util.Scanner;

public class Registreren {
    public static int userID;
    public static String userInput;
    public static String userName;
    public static String userSurname;
    public static String userPW;
    public static boolean registered;

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

        if (userInput.equals("1")) {
            Details();
            userID = Student.studentenLijst.size() + 1; //increment number
            Student newStudent = new Student(userID, userName, userSurname, userPW);
            Student.addStudent(newStudent);
            registered = true;
            System.out.println("Student geregistreerd");
        } else if (userInput.equals("2")) {
            Details();
            userID = Examinator.examinatorLijst.size() + 1; //increment number
            Examinator newEx = new Examinator(userID, userName, userSurname, userPW);
            Examinator.addEx(newEx);
            registered = true;
            System.out.println("Examinator geregistreerd");
        }
        return registered;
    }
}