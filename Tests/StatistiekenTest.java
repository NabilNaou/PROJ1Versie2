import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatistiekenTest {

    @Test
    void onvoldoendesFilteren() {
        Statistieken statistieken = new Statistieken();
        Exam exam1 = new Exam("Examen1");
        Exam exam2 = new Exam("Examen2");
        Exam exam3 = new Exam("Examen3");

        Student student1 = new Student(1, "Jan", "Jaap", "ww1");
        Student student2 = new Student(2,"Jaap", "Gerrit", "ww2");

        Cijfer cijfer1 = new Cijfer(5.5, exam1, student1);
        Cijfer cijfer2 = new Cijfer(5.4, exam2, student1);
        Cijfer cijfer3 = new Cijfer(5.6, exam3, student1);

        Cijfer cijfer4 = new Cijfer(8.3, exam1, student2);
        Cijfer cijfer5 = new Cijfer(4.8, exam2, student2);
        Cijfer cijfer6 = new Cijfer(3.2, exam3, student2);

        CijfersLijst.getCijferList().add(cijfer1);
        CijfersLijst.getCijferList().add(cijfer2);
        CijfersLijst.getCijferList().add(cijfer3);
        CijfersLijst.getCijferList().add(cijfer4);
        CijfersLijst.getCijferList().add(cijfer5);
        CijfersLijst.getCijferList().add(cijfer6);

        statistieken.onvoldoendesFilteren();
    }

    @Test
    void voldoendesFilteren() {
    }

    @Test
    void getVoldoendeOnvoldoendeProcent() {
    }

    @Test
    void gemiddeldeCijferStudent() {
    }

    @Test
    void gemiddeldeCijferExamen() {
    }

    @Test
    void getStudentMetMeesteExamensGehaald() {
    }

    @Test
    void getAllBehaaldeExamensStudentId() {
    }

    @Test
    void getAllBehaaldeExamensStudent() {
    }

    @Test
    void checkExamenGeslaagdStudentId() {
    }

    @Test
    void checkExamenGeslaagdStudent() {
    }
}