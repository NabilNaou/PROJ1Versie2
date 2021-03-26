import java.util.ArrayList;

public class Vraag {
    String Vraag;
    String AntA;
    String AntB;
    String AntC;
    String Antwoord;

    public Vraag(String vraag, String antA, String antB, String antC, String antwoord) {
        Vraag = vraag;
        AntA = antA;
        AntB = antB;
        AntC = antC;
        Antwoord = antwoord;
    }
    public Vraag(String vraag, String antwoord){
        Vraag = vraag;
        Antwoord = antwoord;
    }

    public String getAntwoord() {
        return Antwoord;
    }

    public String getVraag() {
        return Vraag;
    }

    public void setVraag(String vraag) {
        Vraag = vraag;
    }

    public String getAntA() {
        return AntA;
    }

    public void setAntA(String antA) {
        AntA = antA;
    }

    public String getAntB() {
        return AntB;
    }

    public void setAntB(String antB) {
        AntB = antB;
    }

    public String getAntC() {
        return AntC;
    }

    public void setAntC(String antC) {
        AntC = antC;
    }
}

