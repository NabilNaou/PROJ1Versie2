import java.util.ArrayList;

public class Statistieken {
    private ArrayList<Exam> examens;

    public Integer getGemiddeldeByID(int StudentID)
    {
        int examensSize = examens.size();
        int cijfersOpgeteld = 0;
    for(Exam exam : examens)
    {
        // if(exam.getStudentID() == StudentID)
        {
            cijfersOpgeteld = cijfersOpgeteld + exam.getCijfer();
        }
    }
        return cijfersOpgeteld / examensSize;
    }

    // Jarrel -- < warning! >
    // Onvoldoendes filteren
    // Voldoendes filteren
    // Gemiddelde exames op basis van de naam van de id van een student (Done)
    // Gemiddelde exames op basis van de naam van de examen
}