import java.util.Scanner;

public class Registreren {
    public static int userID;
    public static String userInput;
    public static String userName;
    public static String userSurname;
    public static String userPW;

    public static String tempUser;
    public static String tempPass;
    //public static int currentUser;

    public static boolean registered;

    public static boolean Details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voer in uw...");
        System.out.println("naam: ");
        userName = sc.nextLine();
        System.out.println("achternaam: ");
        userSurname = sc.nextLine();
        System.out.println("wachtwoord: ");
        userPW = sc.nextLine();
        return true;
    }

    public static boolean Registration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Maak een keuze...");
        System.out.println("1) Student");
        System.out.println("2) Examinator");
        userInput = sc.nextLine();

        // Checks if user chose 1 or 2
        if (userInput.equals("1")) {
            // Asks user for name, surname and password
            Details();
            // Inserts userID by taking the arraylist size and adding +1
            userID = Student.studentenLijst.size() + 1; //increment number
            Student newStudent = new Student(userID, userName, userSurname, userPW);
            Student.addStudent(newStudent);
            // Used a for-loop to check if the user now exists in the arraylist
            for (int i = 0; i < Student.studentenLijst.size(); i++) {
                // tempUser is used a temporary variable that acts as username while comparing it to the users input
                tempUser = Student.studentenLijst.get(i).getNaam();
                // tempUser is used a temporary variable that acts as password while comparing it to the users input
                tempPass = Student.studentenLijst.get(i).getWachtwoord();
                // Makes currentUser the same as the users ID
                Login.currentUser = Student.studentenLijst.get(i).getId();
                // Compares user input with all options in the arraylist for both username and password
                if (userName.equals(tempUser) && userPW.equals(tempPass)) {
                    System.out.println("Student geregistreerd");
                    registered = true;
                    MainMenu.HoofdMenuText();
                } else {
                    registered = false;
                }
            }
        } else if (userInput.equals("2")) {
            Details();
            userID = Examinator.examinatorLijst.size() + 1; //increment number
            Examinator newEx = new Examinator(userID, userName, userSurname, userPW);
            Examinator.addEx(newEx);
            for (int i = 0; i < Examinator.examinatorLijst.size(); i++) {
                tempUser = Examinator.examinatorLijst.get(i).getNaam();
                tempPass = Examinator.examinatorLijst.get(i).getWachtwoord();
                Login.currentUser = Examinator.examinatorLijst.get(i).getId();
                if (userName.equals(tempUser) && userPW.equals(tempPass)) {
                    System.out.println("Examinator geregistreerd");
                    registered = true;
                    MainMenu.HoofdMenuText();
                } else {
                registered = false;
                }
            }
        }
        return registered;
    }
}