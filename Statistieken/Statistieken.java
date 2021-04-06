import java.lang.reflect.Array;
import java.util.*;

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
    public String onvoldoendesFilteren(){
        String ret = "";
        ArrayList<Cijfer> onvoldoendes = new ArrayList<>();
        for(int i=0; i<cijfersLijst.size(); i++){
            if(cijfersLijst.get(i).getCijfer() < 5.5){
                onvoldoendes.add(cijfersLijst.get(i));
            }
        }
        if(onvoldoendes.size() <= 0){
            ret = "Er zijn geen onvoldoendes\n";
        }
        else {
            ret = "Lijst met onvoldoendes:\n";
            for (Cijfer onvoldoende : onvoldoendes) {
                ret += onvoldoende.toString() + "\n";
            }
        }
        return ret;
    }

    // Voldoendes filteren
    public String voldoendesFilteren(){
        String ret = "";
        ArrayList<Cijfer> voldoendes = new ArrayList<>();
        for(int i=0; i<cijfersLijst.size(); i++){
            if(cijfersLijst.get(i).getCijfer() >= 5.5){
                voldoendes.add(cijfersLijst.get(i));
            }
        }
        if(voldoendes.size() <= 0){
            ret = "Er zijn geen voldoendes\n";
        }
        else {
            ret = "Lijst met voldoendes:\n";
            for (Cijfer voldoende : voldoendes) {
                ret += voldoende.toString() + "\n";
            }
        }
        return ret;
    }

    public String getVoldoendeOnvoldoendeProcent(){
        String ret = "";
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
        if(voldoendes.size() == 0 && onvoldoendes.size() == 0) {
            ret = "Er zijn geen cijfers in de cijferlijst\n";
        }
        else if(voldoendes.size() == 0) {
            ret = "procent voldoendes= 0%\n";
        }
        else if(onvoldoendes.size() == 0) {
            ret = "procent voldoendes= 100%\n";
        }
        else {
            double procentVoldoendes = voldoendes.size()/onvoldoendes.size() * 100;
            double procentOnvoldoendes = onvoldoendes.size()/voldoendes.size() * 100;
            ret = "Voldoendes= " + procentVoldoendes +
                    "\nOnvoldoendes= " + procentOnvoldoendes + "\n";
        }
        return ret;
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

    public String getStudentMetMeesteExamensGehaald() {
        String ret = "";
        ArrayList<Cijfer> voldoendes = new ArrayList<>();
        for(int i=0; i<cijfersLijst.size(); i++){
            if(Double.compare(cijfersLijst.get(i).getCijfer(), 5.5) >= 0){
                voldoendes.add(cijfersLijst.get(i));
            }
        }
        ArrayList<Integer> aantalExamensGehaaldPerStudent = new ArrayList<>();

        for(int i=0; i<Student.studentenLijst.size(); i++) {
            int k = 0;
            for(int j=0; j<voldoendes.size(); i++){
                if(voldoendes.get(j).getStudentID() == Student.studentenLijst.get(i).getId()){
                    k++;
                }
            }
            aantalExamensGehaaldPerStudent.add(k);
        }

        ret = "De volgende student(en) heeft/hebben de meeste aantal examens gehaald:\n";
        int maxAantal = Collections.max(aantalExamensGehaaldPerStudent);
        for(int i=0; i<aantalExamensGehaaldPerStudent.size(); i++){
            if(maxAantal == aantalExamensGehaaldPerStudent.get(i)){
                ret += Student.studentenLijst.get(i).getNaam() + "\n";
            }
        }
        return ret;
    }

    public void getAllBehaaldeExamensStudentId() {
        System.out.println("Voer de studentenId in:");
        String studentId = userInput.nextLine();
        int aantal = 0;
        ArrayList<String> examens = new ArrayList<>();
        for(int i=0; i<cijfersLijst.size(); i++){
            if((cijfersLijst.get(i).getStudentID() == Integer.parseInt(studentId))
                    && (Double.compare(cijfersLijst.get(i).getCijfer(), 5.5) >= 0)){
                examens.add(cijfersLijst.get(i).getExamenNaam());
                aantal++;
            }
        }
        System.out.println("Aantal behaalde examens voor studentId '" + studentId + "' is " + aantal);
        if(examens.size() > 0){
            System.out.println("De student heeft de volgende examens gehaald:");

            for(int i=0; i<examens.size(); i++){
                System.out.println(examens.get(i));
            }
        }
    }

    public void getAllBehaaldeExamensStudent() {
        int aantal = 0;
        ArrayList<String> examens = new ArrayList<>();
        for(int i=0; i<cijfersLijst.size(); i++){
            if((cijfersLijst.get(i).getStudentID() == Student.zoekStudentViaID(Login.getCurrentUser()).getId())
                    && (Double.compare(cijfersLijst.get(i).getCijfer(), 5.5) >= 0)){
                examens.add(cijfersLijst.get(i).getExamenNaam());
                aantal++;
            }
        }
        System.out.println("Aantal behaalde examens voor studentnaam '" + Student.zoekStudentViaID(Login.getCurrentUser()).getNaam() + "' is " + aantal);
        if(examens.size() > 0){
            System.out.println("De student heeft de volgende examens gehaald:");

            for(int i=0; i<examens.size(); i++){
                System.out.println(examens.get(i));
            }
        }
    }

    public void checkExamenGeslaagdStudentId() {
        System.out.println("Voer de studentenId in:");
        String studentId = userInput.nextLine();
        System.out.println("Voer de examen in:");
        String examenNaam = userInput.nextLine();
        boolean check = false;
        for(int i=0; i<cijfersLijst.size(); i++){
            if((cijfersLijst.get(i).getStudentID() == Integer.parseInt(studentId))
                    && (Double.compare(cijfersLijst.get(i).getCijfer(), 5.5) >= 0)
                    && (examenNaam.equals(cijfersLijst.get(i).getExamenNaam()))){
                check = true;
                break;
            }
        }
        if(check) {
            System.out.println("Student is geslaagd voor deze examen");
        }
        else {
            System.out.println("Student is niet geslaagd voor deze examen");
        }
    }

    public void checkExamenGeslaagdStudent() {
        System.out.println("Voer de examen in:");
        String examenNaam = userInput.nextLine();
        boolean check = false;
        for (int i = 0; i < cijfersLijst.size(); i++) {
            if ((cijfersLijst.get(i).getStudentID() == Student.zoekStudentViaID(Login.getCurrentUser()).getId())
                    && (Double.compare(cijfersLijst.get(i).getCijfer(), 5.5) >= 0)
                    && (examenNaam.equals(cijfersLijst.get(i).getExamenNaam()))) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Student is geslaagd voor deze examen");
        } else {
            System.out.println("Student is niet geslaagd voor deze examen");
        }
    }
}