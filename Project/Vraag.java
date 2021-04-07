public class Vraag{
    private static int ID = 0;
    private String description;
    private String ansA;
    private String ansB;
    private String ansC;
    private String answer;

    public Vraag(String description, String ansA, String ansB, String ansC, String answer){
        this.description = description;
        this.ansA = ansA;
        this.ansB = ansB;
        this.ansC = ansC;
        this.answer = answer;
        ID = newID();
    }

    public String getVraag(){
        return description;
    }

    public String getAntA(){
        return ansA;
    }

    public String getAntB(){
        return ansB;
    }

    public String getAntC(){
        return ansC;
    }

    public String getAntwoord(){
        return answer;
    }

    public Integer newID(){
        ID++;
        return ID;
    }

    public Integer getID(){
        return ID;
    }
}