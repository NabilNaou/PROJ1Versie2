import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Student bob = new Student(1, "bob","tester", "test123");
    Student marie = new Student(2, "marie","tester", "test123");

    @Test
    void addCijfer() {
        Toetsen toets = new Toetsen(bob,"AutoExamen", 4);
        Database.studentenLijst.add(bob);
        Database.studentenLijst.add(marie);
        Database.studentenLijst.get(0).cijferlijst.add(toets);
        Assertions.assertEquals(toets, Database.studentenLijst.get(0).cijferlijst.get(0));
    }

}