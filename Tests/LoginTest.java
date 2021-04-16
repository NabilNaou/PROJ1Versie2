import static org.junit.jupiter.api.Assertions.*;

class LoginTest{
    @org.junit.jupiter.api.Test
    void chooseLogin() {
        // simulate user input
        System.out.println("Wilt u: 1) inloggen of 2) registreren");
        Login.userChoice = "1"; // keuze 1 of 2

        // Choice is 1
        Login.choseLogin = true; // True als login klopt en false als login niet klopt.
        assertTrue(Login.choseLogin);

        // choice is 2
        Login.userChoice = "2"; // keuze 1 of 2
        Login.choseLogin= Registreren.registered = true; // True als registratie compleet is.
        assertTrue(Login.choseLogin);
    }

    @org.junit.jupiter.api.Test
    void checkEqual() {
        Login.correct = true; // simulate result of check if login is succesfully logged in.
        assertEquals(true,Login.correct);
    }

    @org.junit.jupiter.api.Test
    void infoReqUsernameAndPassword() {
        Login.targetUser = "bob";
        Login.targetPassword ="bob123";
        assertEquals("bob",Login.targetUser);
        assertEquals("bob123",Login.targetPassword);
    }

    @org.junit.jupiter.api.Test
    void userAndPassCheck() {
        // simulate user input
        Login.targetUser = "tim";
        Login.tempUser = "tim";
        assertEquals(Login.targetUser,Login.tempUser);
        Login.targetPassword = "tim123";
        Login.tempPass = "tim123";
        assertEquals(Login.targetUser,Login.tempUser);
    }

    @org.junit.jupiter.api.Test
    void getCurrentUser() {
        Login.currentUser = 1;
        assertEquals(1,Login.currentUser);
    }
}