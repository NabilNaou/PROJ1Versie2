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
    public static boolean userPassCheck;


    public static boolean chooseLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wilt u: 1) inloggen of 2) registreren");
        userChoice = sc.nextLine();

        switch (userChoice)
        {
            case "1" -> {
                choseLogin = checkEqual();
            }
            case "2" -> {
                choseLogin = false;
                Registreren.Registration();
            }
        }
        return choseLogin;
    }

    public static boolean checkEqual() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bent u 1) student of 2) examinator?");
        userInput = sc.nextLine();

        //Checks if user is examinator or student
        if (userInput.equals("1") || userInput.equals("2")) {

            //Loops through ArrayList to see if entered user and password correspond with stored data
            if (userInput.equals("1")) {
                System.out.println("Student gekozen...");
                if(infoReq()){
                    for (int i = 0; i < Database.studentenLijst.size(); i++) {
                        tempUser = Database.studentenLijst.get(i).getNaam();
                        tempPass = Database.studentenLijst.get(i).getWachtwoord();
                        currentUser = Database.studentenLijst.get(i).getStudentNummer();
                        System.out.println("Switching to user and password check method");
                        if (userAndPassCheck()) {
                            return correct = true;
                        }
                    }
                }
                System.out.println("After for-loop");

            } else if (userInput.equals("2")) {
                System.out.println("Examinator gekozen...");
                if(infoReq()) {
                    for (int i = 0; i < Database.examinatorlijst.size(); i++) {
                        tempUser = Database.examinatorlijst.get(i).getNaam();
                        tempPass = Database.examinatorlijst.get(i).getWachtwoord();
                        currentUser = Database.examinatorlijst.get(i).getId();
                        if (userAndPassCheck()) {
                            return correct = true;
                        }
                    }
                }
            } else {
                correct = false;
                System.out.println("Probeer opnieuw...");
                chooseLogin();
            }
        }
        return correct;
    }

    public static boolean infoReq() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voer uw naam in...");
        targetUser = sc.nextLine();
        System.out.println("Voer uw wachtwoord in...");
        targetPassword = sc.nextLine();
        return true;
    }

    public static boolean userAndPassCheck() {
        System.out.println("Gegevens aan het checken...");
        if (targetUser.equals(tempUser) && targetPassword.equals(tempPass)) {
            System.out.println("login geslaagd");
            userPassCheck = true;
        } else {
            userPassCheck = false;
        }
        return userPassCheck;
    }

    public static int getCurrentUser() {
        return currentUser;
    }
}
