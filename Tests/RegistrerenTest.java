import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegistrerenTest {
    @Test
    void details() {
        Registreren.userName = "Rick";
        Registreren.tempUser ="Rick";
        assertEquals(Registreren.userName,Registreren.tempUser);

        Registreren.userPW = "RickyV";
        Registreren.tempPass = "RickyV";
        assertEquals(Registreren.userPW,Registreren.tempPass);
    }

    @Test
    void registration() {
        Registreren.registered = true; //If registered is true, registration succeeded
        assertEquals(true, Registreren.registered);

        Registreren.registered = false; //If registered is false, registration didn't succeed
        assertEquals(false, Registreren.registered);
    }
}