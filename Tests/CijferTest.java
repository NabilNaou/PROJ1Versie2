import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CijferTest{
    Student student = new Student(1, "Mark", "Vazovski", "123");
    Exam exam = new Exam("TestExamen");
    Cijfer cijfer = new Cijfer(2.0, exam, student);
    @Test
    void getCijfer() {
        double testCijfer = 2.0;
        Assertions.assertEquals(testCijfer, cijfer.getCijfer());
    }

    @Test
    void getStudentID() {
        int testID = 1;
        Assertions.assertEquals(testID, cijfer.getStudentID());
    }

    @Test
    void getExamenNaam() {
        String testExamenNaam = "TestExamen";
        Assertions.assertEquals(testExamenNaam, cijfer.getExamenNaam());
    }
}