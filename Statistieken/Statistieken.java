import java.util.ArrayList;

public class Statistieken {
    private ArrayList<Exam> examens;

    public Integer getGemiddeldeByID(Integer StudentID)
    {
        int examensSize = examens.size();
        int i = 0;
     for(Exam exam : examens){
        if(exam.getStudentID() == StudentID)
        {
            i = i + exam.getCijfer();
        }
    }
     return i / examensSize;
    }

}
