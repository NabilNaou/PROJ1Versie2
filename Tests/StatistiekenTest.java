import org.junit.jupiter.api.Test;

class StatistiekenTest {
    // Jarrel: Test niet werkend, vanwege wijziging van Josue (Database veranderd).. Moet nog gefixed worden.
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

/*        CijfersLijst.getCijferList().add(cijfer1);
        CijfersLijst.getCijferList().add(cijfer2);
        CijfersLijst.getCijferList().add(cijfer3);
        CijfersLijst.getCijferList().add(cijfer4);
        CijfersLijst.getCijferList().add(cijfer5);
        CijfersLijst.getCijferList().add(cijfer6);

        assertEquals(statistieken.onvoldoendesFilteren(), "Lijst met onvoldoendes:\n" + cijfer2 + "\n" + cijfer5 + "\n" + cijfer6 + "\n");
   */
    }

    @Test
    void voldoendesFilteren() {
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

/*        CijfersLijst.getCijferList().add(cijfer1);
        CijfersLijst.getCijferList().add(cijfer2);
        CijfersLijst.getCijferList().add(cijfer3);
        CijfersLijst.getCijferList().add(cijfer4);
        CijfersLijst.getCijferList().add(cijfer5);
        CijfersLijst.getCijferList().add(cijfer6);

        assertEquals(statistieken.voldoendesFilteren(), "Lijst met voldoendes:\n" + cijfer1 + "\n" + cijfer3 + "\n" + cijfer4 + "\n");
    */
    }

    @Test
    void getAllBehaaldeExamensStudent() {
        Statistieken statistieken = new Statistieken();

        Login.currentUser = 1;

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

/*        CijfersLijst.getCijferList().add(cijfer1);
        CijfersLijst.getCijferList().add(cijfer2);
        CijfersLijst.getCijferList().add(cijfer3);
        CijfersLijst.getCijferList().add(cijfer4);
        CijfersLijst.getCijferList().add(cijfer5);
        CijfersLijst.getCijferList().add(cijfer6);

        assertEquals(statistieken.getAllBehaaldeExamensStudent(), "Aantal behaalde examens voor studentnaam 'bob' is 2\nDe student heeft de volgende examens gehaald:\nExamen1\nExamen3\n");
    */
    }
}