import java.util.ArrayList;

public class Vraag {
    private int ID;
    private String description;
    private String ans1;
    private String ans2;
    private String ans3;
    private String answer;

    public Vraag(String description, String ans1, String ans2, String ans3, String answer){
        this.description = description;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.answer = answer;
    }

    public String getVraag(){
        return description;
    }

    public String getAntA(){
        return ans1;
    }

    public String getAntB(){
        return ans2;
    }

    public String getAntC(){
        return ans3;
    }
    public String getAntwoord(){
        return answer;
    }
    public Integer getID(){
        return ID;
    }
    /*
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

     */
}

