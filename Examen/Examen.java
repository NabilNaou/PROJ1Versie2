import java.util.ArrayList;

public class Examen {
    private Integer examenCode;
    private String examenNaam;
    private String status;
    public static Examen examenLijst;

    public Examen(Integer examenCode, String examenNaam, String status) {
        this.examenCode = examenCode;
        this.examenNaam = examenNaam;
        this.status = status;
    }

    public Integer getExamenCode() {
        return examenCode;
    }

    public String getExamenNaam() {
        return examenNaam;
    }

    public String getStatus() {
        return status;
    }

    //Temporarily to create a small beginning
    public static ArrayList<Examen> examList = new ArrayList<>() {
        {
            add(examenLijst = new Examen(1,"Prakijk","x"));
            add(examenLijst = new Examen(2,"Theorie","x"));
        }
    };

    // Get all exams
    public static ArrayList<Examen> getAllExams() {
        for (Examen exams : examList)
        {
            System.out.println(exams.getExamenNaam() + " " + exams.getStatus());
        }
        return examList;
    }
}
