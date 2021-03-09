import java.util.Scanner;

public class Login {
    // check if User exist in LedenLijst
    public static int currentUser;
    public static String userInput;
    public static boolean checkEqual() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bent u een examinator of student?");
        userInput = sc.nextLine();
        if (userInput.equals("student") || userInput.equals("Student") || userInput.equals("examinator") || userInput.equals("Examinator")) {
            System.out.println("Voer uw naam in...");
            String targetUser = sc.nextLine();
            System.out.println("Voer uw wachtwoord in...");
            String targetPassword = sc.nextLine();

            boolean correct = false;
            //Loops through ArrayList to see if entered user and password correspond with stored data
            if (userInput.equals("student") || userInput.equals("Student")) {
                for (int i = 0; i < LedenLijst.studentenLijst.size(); i++) {
                    String tempuser = LedenLijst.studentenLijst.get(i).getNaam();
                    String temppass = LedenLijst.studentenLijst.get(i).getWachtwoord();
                    if (targetUser.equals(tempuser) & targetPassword.equals(temppass)) {
                        currentUser = i;
                        correct = true;
                        System.out.println("Gegevens aan het checken...");
                        System.out.println("login geslaagd");
                    }
                }
            }
            if (userInput.equals("examinator") || userInput.equals("Examinator")) {
                for (int i = 0; i < LedenLijst.examinatorLijst.size(); i++) {
                    String tempuser = LedenLijst.examinatorLijst.get(i).getName();
                    String temppass = LedenLijst.examinatorLijst.get(i).getWachtwoord();
                    if (targetUser.equals(tempuser) & targetPassword.equals(temppass)) {
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

    public static int getCurrentUser() {
        return currentUser;
    }
}
