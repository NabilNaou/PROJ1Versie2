public class Toetsen {
    private Student Student;
    private String ToetsNaam;
    private double Uitslag;

    public Student getStudent() {
        return Student;
    }

    public void setStudent(Student student) {
        Student = student;
    }

    public String getToetsNaam() {
        return ToetsNaam;
    }

    public void setToetsNaam(String toetsNaam) {
        ToetsNaam = toetsNaam;
    }

    public double getUitslag() {
        return Uitslag;
    }

    public void setUitslag(int uitslag) {
        Uitslag = uitslag;
    }

    public Toetsen(Student Student, String ToetsNaam, double Uitslag){
        this.Student = Student;
        this.ToetsNaam = ToetsNaam;
        this.Uitslag = Uitslag;
    }

}
