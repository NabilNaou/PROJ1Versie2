public class Cijfer {
    private Student student;
    private Exam exam;
    private double cijfer;

    public Cijfer(double cijfer, Exam exam, Student student){
        this.cijfer = cijfer;
        this.exam = exam;
        this.student = student;
    }

    public double getCijfer() {
        return cijfer;
    }
    public int getStudentID(){
        return student.getId();
    }
    public String getExamenNaam(){
        return exam.getExamenNaam();
    }

    @Override
    public String toString() {
        return "cijfer= " + cijfer +
                "van student " + student +
                "voor exam " + exam + "\n";
    }
}