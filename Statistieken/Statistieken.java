import java.util.ArrayList;

public class Statistieken {
    private ArrayList<Exam> examens;
    private CijfersLijst cijfersLijst;

    //Dit heeft jarrel niet gemaakt
    /*public Integer getGemiddeldeByID(int StudentID)
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
    }*/

    // Jarrel -- < warning! >
    // Onvoldoendes filteren
    public void onvoldoendesFilteren(){
        ArrayList<Cijfer> onvoldoendes = new ArrayList<>();
        for(int i=0; i<cijfersLijst.getCijferList().size(); i++){
            if(cijfersLijst.getCijferList().get(i).getCijfer() < 5.5){
                onvoldoendes.add(cijfersLijst.getCijferList().get(i));
            }
        }
        for (Cijfer onvoldoende : onvoldoendes) {
            System.out.println("Lijst met onvoldoendes:");
            System.out.println(onvoldoende.toString());
        }
    }

    // Voldoendes filteren
    public void voldoendesFilteren(){
        ArrayList<Cijfer> voldoendes = new ArrayList<>();
        for(int i=0; i<cijfersLijst.getCijferList().size(); i++){
            if(cijfersLijst.getCijferList().get(i).getCijfer() >= 5.5){
                voldoendes.add(cijfersLijst.getCijferList().get(i));
            }
        }
        for (Cijfer voldoende : voldoendes) {
            System.out.println("Lijst met onvoldoendes:");
            System.out.println(voldoende.toString());
        }
    }

    // Gemiddelde van de cijfers op basis van de naam van de id van een student (Done)
    public void gemiddeldeCijferStudent(){

    }

    // Gemiddelde van de cijfers op basis van de naam van de examen

}