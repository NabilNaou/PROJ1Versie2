import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainMenuTest {
    @Test
    void loginScherm() {
        // simulate user input
        System.out.println("Wilt u: 1) inloggen of 2) registreren");
        Login.userChoice = "1"; // keuze 1 of 2

        // Choice is 1
        Login.choseLogin = true; // True als login klopt en false als login niet klopt.
        assertTrue(Login.choseLogin);

        // choice is 2
        Login.userChoice = "2"; // keuze 1 of 2
        Login.choseLogin= Registreren.registered = true; // True als registratie kompleet is.
        assertTrue(Login.choseLogin);
    }
}