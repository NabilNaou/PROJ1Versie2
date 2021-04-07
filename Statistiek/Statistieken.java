import java.util.*;
import static java.lang.System.in;

public class Statistieken {
    private static Scanner userInput = new Scanner(in);

    // Jarrel:
    // Onvoldoendes filteren
    public String onvoldoendesFilteren(){
        String ret = "";
        ArrayList<Cijfer> onvoldoendes = new ArrayList<>();
        for(int i=0; i< Database.getCijferList().size(); i++){
            if(Database.getCijferList().get(i).getCijfer() < 5.5){
                onvoldoendes.add(Database.getCijferList().get(i));
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
        for(int i=0; i<Database.getCijferList().size(); i++){
            if(Database.getCijferList().get(i).getCijfer() >= 5.5){
                voldoendes.add(Database.getCijferList().get(i));
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
        for(int i=0; i<Database.getCijferList().size(); i++){
            if(Database.getCijferList().get(i).getCijfer() >= 5.5){
                voldoendes.add(Database.getCijferList().get(i));
            }
        }
        ArrayList<Cijfer> onvoldoendes = new ArrayList<>();
        for(int i=0; i<Database.getCijferList().size(); i++){
            if(Database.getCijferList().get(i).getCijfer() < 5.5){
                onvoldoendes.add(Database.getCijferList().get(i));
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

    public String getStudentMetMeesteExamensGehaald() {
        String ret = "";
        ArrayList<Cijfer> voldoendes = new ArrayList<>();
        for(int i=0; i<Database.getCijferList().size(); i++){
            if(Double.compare(Database.getCijferList().get(i).getCijfer(), 5.5) >= 0){
                voldoendes.add(Database.getCijferList().get(i));
            }
        }
        ArrayList<Integer> aantalExamensGehaaldPerStudent = new ArrayList<>();

        for(int i=0; i<Database.studentenLijst.size(); i++) {
            int k = 0;
            for(int j=0; j<voldoendes.size(); i++){
                if(voldoendes.get(j).getStudentID() == Database.studentenLijst.get(i).getStudentNummer()){
                    k++;
                }
            }
            aantalExamensGehaaldPerStudent.add(k);
        }

        ret = "De volgende student(en) heeft/hebben de meeste aantal examens gehaald:\n";
        int maxAantal = Collections.max(aantalExamensGehaaldPerStudent);
        for(int i=0; i<aantalExamensGehaaldPerStudent.size(); i++){
            if(maxAantal == aantalExamensGehaaldPerStudent.get(i)){
                ret += Database.studentenLijst.get(i).getNaam() + "\n";
            }
        }
        return ret;
    }

    public void getAllBehaaldeExamensStudentId() {
        System.out.println("Voer de studentenId in:");
        String studentId = userInput.nextLine();
        int aantal = 0;
        ArrayList<String> examens = new ArrayList<>();
        for(int i=0; i<Database.getCijferList().size(); i++){
            if((Database.getCijferList().get(i).getStudentID() == Integer.parseInt(studentId))
                    && (Double.compare(Database.getCijferList().get(i).getCijfer(), 5.5) >= 0)){
                examens.add(Database.getCijferList().get(i).getExamenNaam());
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
        for(int i=0; i<Database.getCijferList().size(); i++){
            if((Database.getCijferList().get(i).getStudentID() == Student.zoekStudentViaID(Login.getCurrentUser()).getStudentNummer())
                    && (Double.compare(Database.getCijferList().get(i).getCijfer(), 5.5) >= 0)){
                examens.add(Database.getCijferList().get(i).getExamenNaam());
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
        for(int i=0; i<Database.getCijferList().size(); i++){
            if((Database.getCijferList().get(i).getStudentID() == Integer.parseInt(studentId))
                    && (Double.compare(Database.getCijferList().get(i).getCijfer(), 5.5) >= 0)
                    && (examenNaam.equals(Database.getCijferList().get(i).getExamenNaam()))){
                check = true;
                break;
            }
        }
        if(check) {
            System.out.println("Student is geslaagd voor deze examen");
        }
        else {
            System.out.println("Student is niet geslaagd voor deze examen of de examen bestaat niet");
        }
    }

    public void checkExamenGeslaagdStudent() {
        System.out.println("Voer de examen in:");
        String examenNaam = userInput.nextLine();
        boolean check = false;
        for (int i = 0; i < Database.getCijferList().size(); i++) {
            if ((Database.getCijferList().get(i).getStudentID() == Student.zoekStudentViaID(Login.getCurrentUser()).getStudentNummer())
                    && (Double.compare(Database.getCijferList().get(i).getCijfer(), 5.5) >= 0)
                    && (examenNaam.equals(Database.getCijferList().get(i).getExamenNaam()))) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Student is geslaagd voor deze examen");
        } else {
            System.out.println("Student is niet geslaagd voor deze examen of de examen bestaat niet");
        }
    }
}