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
    public static boolean correct;

    public static boolean chooseLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wilt u: 1) inloggen of 2) registreren");
        userChoice = sc.nextLine();

        switch (userChoice) {
            case "1" -> {
                choseLogin = true;
                checkEqual();
            }
            case "2" -> Registreren.Registration();
            default -> { System.out.println("Wilt u: 1) inloggen of 2) registreren");
                userChoice = sc.nextLine();
                choseLogin = false;
            }
        }
        return choseLogin;
    }

    public static void infoReq() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voer uw naam in...");
        targetUser = sc.nextLine();
        System.out.println("Voer uw wachtwoord in...");
        targetPassword = sc.nextLine();
    }

    public static boolean userAndPassCheck() {
        correct = false;
        if (targetUser.equals(tempUser) & targetPassword.equals(tempPass)) {
            System.out.println("Gegevens aan het checken...");
            System.out.println("login geslaagd");
            correct = true;
        }
        return correct;
    }

    public static boolean checkEqual() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bent u 1) student of 2) examinator?");
        userInput = sc.nextLine();

        //Checks if user is examinator or student
        if (userInput.equals("1") || userInput.equals("2")) {
            infoReq();

            //Loops through ArrayList to see if entered user and password correspond with stored data
            if (userInput.equals("1")) {
                for (int i = 0; i < LedenLijst.studentenLijst.size(); i++) {
                    tempUser = LedenLijst.studentenLijst.get(i).getNaam();
                    tempPass = LedenLijst.studentenLijst.get(i).getWachtwoord();
                    currentUser = i;
                    userAndPassCheck();
                }
            } else if (userInput.equals("2")) {
                for (int i = 0; i < LedenLijst.examinatorLijst.size(); i++) {
                    tempUser = LedenLijst.examinatorLijst.get(i).getNaam();
                    tempPass = LedenLijst.examinatorLijst.get(i).getWachtwoord();
                    currentUser = i;
                    userAndPassCheck();
                }
            }
        } else {
            System.out.println("Probeer opnieuw...");
        }
        return correct;
    }

    public static int getCurrentUser() {
        return currentUser;
    }
}
