import java.util.Scanner;

public class Login {
    // check if User exist in LedenLijst
    public static int currentUser;
    public static String userInput;
    public static String targetUser;
    public static String targetPassword;
    public static String tempUser;
    public static String tempPass;

    public static String userChoice;
    public static boolean choseLogin;

    public static boolean chooseLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wilt u: 1) inloggen " +
                "of " +
                "2) registreren");
        userChoice = sc.nextLine();

        switch (userChoice) {
            case "1" -> {
                choseLogin = true;
                checkEqual();
            }
            case "2" -> Registreren.Registration();
            default -> { System.out.println("Wilt u: 1) inloggen of 2) registreren");
                userChoice = sc.nextLine();
                choseLogin = false; }
        }
        return choseLogin;
    }
    public static boolean checkEqual() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bent u een examinator of student?");
        userInput = sc.nextLine();
        //Checks if user is examinator or student
        if (studentCheck() || exCheck()) {
            System.out.println("Voer uw naam in...");
            targetUser = sc.nextLine();
            System.out.println("Voer uw wachtwoord in...");
            targetPassword = sc.nextLine();

            boolean correct = false;
            //Loops through ArrayList to see if entered user and password correspond with stored data
            if (studentCheck()) {
                for (int i = 0; i < LedenLijst.studentenLijst.size(); i++) {
                    //tempUser = LedenLijst.studentenLijst.get(i).getName();
                    //tempPass = LedenLijst.studentenLijst.get(i).getWachtwoord();
                    tempPass = LedenLijst.getStudentenLijst().get(i).getNaam();
                    if (targetUser.equals(tempUser) & targetPassword.equals(tempPass)) {
                        currentUser = i;
                        correct = true;
                        System.out.println("Gegevens aan het checken...");
                        System.out.println("login geslaagd");
                    }
                }
            } else if (exCheck()) {
                for (int i = 0; i < LedenLijst.examinatorLijst.size(); i++) {
                    tempUser = LedenLijst.examinatorLijst.get(i).getName();
                    tempPass = LedenLijst.examinatorLijst.get(i).getWachtwoord();
                    if (targetUser.equals(tempUser) & targetPassword.equals(tempPass)) {
                        currentUser = i;
                        correct = true;
                        System.out.println("Gegevens aan het checken...");
                        System.out.println("login geslaagd");
                    }
                }
            }
            return correct;
        } else {
            System.out.println("Probeer opnieuw...");
            return false;
        }
    }

    // Checks if user is a student
    public static boolean studentCheck() {
        boolean check = false;
        if (userInput.equals("student") || userInput.equals("Student")) {
            check = true;
        }
        return check;
    }

    // Checks if user is an examinator
    public static boolean exCheck() {
        boolean check = false;
        if (userInput.equals("examinator") || userInput.equals("Examinator")) {
            check = true;
        }
        return check;
    }

    public static int getCurrentUser() {
        return currentUser;
    }
}
