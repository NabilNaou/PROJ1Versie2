import java.util.ArrayList;

public class Database
{
    public static ArrayList<Student> studentenLijst = new ArrayList<>();
    public static ArrayList<Examinator> examinatorlijst = new ArrayList<>();
    public static ArrayList<Student> AutoExamenDeelnemers = new ArrayList<>();

    public static ArrayList<Vraag> AutoExamenMultipleChoiceVragenlijst = new ArrayList<>();
    public static ArrayList<Vraag> AutoExamenOpenVragenlijst = new ArrayList<>();

    public static ArrayList<Vraag> VaarExamenVragenlijst = new ArrayList<>();
    public static ArrayList<Student> VaarExamenDeelnemers = new ArrayList<>();



    public static ArrayList<Exam> alleExamens = new ArrayList<>();
    private static ArrayList<Cijfer> cijferList = new ArrayList<>();
    public static void addCijfer(Cijfer cijfer){
        cijferList.add(cijfer);
    }
    public static ArrayList<Cijfer> getCijferList(){
        return cijferList;
    }

    public static void mockdata(){
        Examinator jan = new Examinator(1, "jan", "tester", "test123");
        Student bob = new Student(1, "bob","tester", "test123");
        Student marie = new Student(2, "marie","tester", "test123");
        examinatorlijst.add(jan);
        studentenLijst.add(bob);
        studentenLijst.add(marie);
        Vraag Multiplechoice1 = new Vraag("Wat is waar?", "Je mag nergens meer 130 km/u rijden in Nederland.", "Op sommige trajecten mag je 130 km/u rijden tussen 19 uur 's avonds en 6 uur 's ochtends.", "Op sommige trajecten mag je ook overdag nog 130 km/u rijden. ", "b");
        Vraag Multiplechoice2 = new Vraag("Wat is de minimumsnelheid op de snelweg?", "100 km/u", "50 km/u", "60 km/u", "c");
        Vraag Multiplechoice3 = new Vraag("Welke letter staat voor het getal bij een autosnelwegaanduiding?","A","B", "C","a");
        Vraag Multiplechoice4 = new Vraag("Aan welke kant van de auto moet achterop verplicht een mistlap zitten?","links","rechts","middel","a");
        Vraag Multiplechoice5 = new Vraag("Mag je op de snelweg rechts inhalen? ","Rechts inhalen mag, mits veilig en met voldoende afstand op de voorligger. ","Op snelwegen met drie stroken of meer is het toegestaan rechts in te halen.", "Rechts inhalen mag wel, maar alleen bij filevorming of op rijstroken die gescheiden worden door blokmarkering ","c");

        Vraag Openvraag1 = new Vraag("Waarvoor staat de P in de afkorting APK?","Periodieke");
        Vraag Openvraag2 = new Vraag("In welk land opende in 1921 de eerste autosnelweg?","Duitsland");
        Vraag Openvraag3 = new Vraag("In welk werelddeel vind je de meeste vakantiefietsers?","Europa");
        Vraag Openvraag4 = new Vraag("Hoe worden wegen waarvoor je moet betalen om erop te mogen rijden genoemd?","Tolwegen");
        Vraag Openvraag5 = new Vraag("Welk pedaal heb je niet wanneer je in auto met een automatische versnellingsbak rijdt?","Koppeling");


        AutoExamenMultipleChoiceVragenlijst.add(Multiplechoice1);
        AutoExamenMultipleChoiceVragenlijst.add(Multiplechoice2);
        AutoExamenMultipleChoiceVragenlijst.add(Multiplechoice3);
        AutoExamenMultipleChoiceVragenlijst.add(Multiplechoice4);
        AutoExamenMultipleChoiceVragenlijst.add(Multiplechoice5);


        AutoExamenOpenVragenlijst.add(Openvraag1);
        AutoExamenOpenVragenlijst.add(Openvraag2);
        AutoExamenOpenVragenlijst.add(Openvraag3);
        AutoExamenOpenVragenlijst.add(Openvraag4);
        AutoExamenOpenVragenlijst.add(Openvraag5);
        Toetsen toets = new Toetsen(bob,"AutoExamen", 4);
        Database.studentenLijst.get(0).cijferlijst.add(toets);




    }
}