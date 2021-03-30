public class Cijfer {
    private Student student;
    private Exam exam;
    private int cijfer;

    public Cijfer(int cijfer, Exam exam, Student student){
        this.cijfer = cijfer;
        this.exam = exam;
        this.student = student;
    }
    public int getCijfer() {
        return cijfer;
    }
    public Integer getStudentID(){
        return student.getId();
    }
    public String getExamenNaam(){
        return exam.getExamenNaam();
    }
}
