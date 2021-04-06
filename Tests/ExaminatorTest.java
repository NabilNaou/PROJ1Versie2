import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExaminatorTest {

    Examinator ExamUser = new Examinator(100,"tim","osman","tim123");

    @Test
    void addEx() {
        Examinator.addEx(ExamUser);
        Assertions.assertEquals(100, ExamUser.getId());
        Assertions.assertEquals("tim", ExamUser.getNaam());
        Assertions.assertEquals("osman", ExamUser.getAchternaam());
        Assertions.assertEquals("tim123", ExamUser.getWachtwoord());

    }
}