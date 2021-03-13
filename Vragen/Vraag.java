public class Vraag {


    private Integer ID;
    private String descriptie;
    private String ant1;
    private String ant2;
    private String ant3;
    private String correctAntwoord;

    public Vraag(String descriptie, String ant1, String ant2, String ant3, String correctAntwoord){
        this.descriptie = descriptie;
        this.ant1 = ant1;
        this.ant2 = ant2;
        this.ant3 = ant3;
        this.correctAntwoord = correctAntwoord;
    }

    public String getDescriptie(){
        return descriptie;
    }

    public String getAnswer1(){
        return ant1;
    }

    public String getAnswer2(){
        return ant2;
    }

    public String getAnswer3(){
        return ant3;
    }
    public String getCorrectAntwoord(){
        return correctAntwoord;
    }
    public Integer getID(){
        return ID;
    }
}

