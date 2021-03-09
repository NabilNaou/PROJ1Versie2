import java.util.Scanner;

public class Login {
    // check if User exist in LedenLijst
    public static int currentUser;
    public static boolean checkEqual() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voer uw naam in...");
        String targetUser = sc.nextLine();
        System.out.println("Voer uw wachtwoord in...");
        String targetPassword = sc.nextLine();

        boolean correct = false;
        //Loops through ArrayList to see if entered user and password correspond with stored data
        for (int i = 0; i < LedenLijst.studentenLijst.size(); i++) {
            String tempuser = LedenLijst.studentenLijst.get(i).getNaam();
            String temppass = LedenLijst.studentenLijst.get(i).getWachtwoord();
            System.out.println("Gegevens aan het checken...");
            if (targetUser.equals(tempuser) & targetPassword.equals(temppass) ) {
                System.out.println("login geslaagd");
                currentUser = i;
                correct = true;
            }
        }
        return correct;
    }

    public static int getCurrentUser() {
        return currentUser;
    }

}
