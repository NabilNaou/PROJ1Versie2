import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CijfersLijstTest {
    CijfersLijst cijferLijst = new CijfersLijst();
    Student student = new Student(1, "Mark", "Vazovski", "123");
    Exam exam = new Exam("TestExamen");
    Cijfer cijfer = new Cijfer(2.0, exam, student);
    @Test
    void getcijfer() {
        cijferLijst.addCijfer(cijfer);
        double testCijfer = 2.0;
        Assertions.assertEquals(testCijfer, cijferLijst.getcijfer("TestExamen"));
    }

    @Test
    void removeCijfer() {
        cijferLijst.addCijfer(cijfer);
        cijferLijst.removeCijfer(cijfer);
        Cijfer testCijfer = new Cijfer(3.0, exam, student);
        Assertions.assertNotEquals(testCijfer, cijferLijst.getcijfer("TestExamen"));
    }

    @Test
    void getCijferList() {
        ArrayList<Cijfer> cijfers = new ArrayList<>();
        cijfers.add(cijfer);
        cijferLijst.addCijfer(cijfer);
        Assertions.assertEquals(cijfers, cijferLijst.getCijferList());
    }
}