import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Statistieken {
    private ArrayList<Exam> examens;
    private ArrayList<Cijfer> cijfersLijst = CijfersLijst.getCijferList();

    private static Scanner userInput = new Scanner(in);

    //Dit heeft jarrel niet gemaakt
    // Gemiddelde van de exames op basis van de naam van de id van een student (Done)
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
        for(int i=0; i<cijfersLijst.size(); i++){
            if(cijfersLijst.get(i).getCijfer() < 5.5){
                onvoldoendes.add(cijfersLijst.get(i));
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
        for(int i=0; i<cijfersLijst.size(); i++){
            if(cijfersLijst.get(i).getCijfer() >= 5.5){
                voldoendes.add(cijfersLijst.get(i));
            }
        }
        for (Cijfer voldoende : voldoendes) {
            System.out.println("Lijst met onvoldoendes:");
            System.out.println(voldoende.toString());
        }
    }

    public void getVoldoendeOnvoldoendeProcent(){
        ArrayList<Cijfer> voldoendes = new ArrayList<>();
        for(int i=0; i<cijfersLijst.size(); i++){
            if(cijfersLijst.get(i).getCijfer() >= 5.5){
                voldoendes.add(cijfersLijst.get(i));
            }
        }
        ArrayList<Cijfer> onvoldoendes = new ArrayList<>();
        for(int i=0; i<cijfersLijst.size(); i++){
            if(cijfersLijst.get(i).getCijfer() < 5.5){
                onvoldoendes.add(cijfersLijst.get(i));
            }
        }
        double procentVoldoendes = voldoendes.size()/onvoldoendes.size() * 100;
        double procentOnvoldoendes = onvoldoendes.size()/voldoendes.size() * 100;
        System.out.println("Voldoendes= " + procentVoldoendes +
                "\nOnvoldoendes= " + procentOnvoldoendes);
    }

    // Gemiddelde van de cijfers op basis van de naam van de id van een student (Done)
    public void gemiddeldeCijferStudent(int studentId){
        double totaalcijfer = 0;
        for(int i=0; i<cijfersLijst.size(); i++){
            if(cijfersLijst.get(i).getStudentID() == studentId){
                totaalcijfer += cijfersLijst.get(i).getCijfer();
            }
        }
        double gemcijfer = totaalcijfer/(cijfersLijst.size()-1);
        System.out.println("De gemiddelde van studentId '" + studentId + "' is " + gemcijfer);
    }

    // Gemiddelde van de cijfers op basis van de naam van de examen
    public void gemiddeldeCijferExamen(String naam){
        double totaalcijfer = 0;
        for(int i=0; i<cijfersLijst.size(); i++) {
            if (cijfersLijst.get(i).getExamenNaam().equals(naam)) {
                totaalcijfer += cijfersLijst.get(i).getCijfer();
            }
        }
        double gemcijfer = totaalcijfer/(cijfersLijst.size()-1);
        System.out.println("De gemiddelde van examennaam '" + naam + "' is " + gemcijfer);
    }

    public static void examenStatistiekenInfo() {
        System.out.println("Voer de studentenId in:");
        String studentenId = userInput.nextLine();

        /*if(){

        }
        else{
            System.out.println("StudentId is niet gevonden");
        }*/
        MainMenu.HoofdMenuText();
    }



}