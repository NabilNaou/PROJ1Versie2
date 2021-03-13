/*public class TypeExamen {
    private Integer id;
    private String theorieExamen;
    private String praktijkExamen;

    public TypeExamen(Integer id, String theorieExamen, String praktijkExamen) {
        this.id = id;
        this.theorieExamen = theorieExamen;
        this.praktijkExamen = praktijkExamen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheorieExamen() {
        return theorieExamen;
    }

    public void setTheorieExamen(String theorieExamen) {
        this.theorieExamen = theorieExamen;
    }

    public String getPraktijkExamen() {
        return praktijkExamen;
    }

    public void setPraktijkExamen(String praktijkExamen) {
        this.praktijkExamen = praktijkExamen;
    }
}

 */
import java.util.ArrayList;
import java.util.Collections;

public class Vak {
    private String naam;
    private Integer toetsPeriode;
    private ArrayList<Vraag> ToetsPeriode1 = new ArrayList();
    private ArrayList<Vraag> ToetsPeriode2 = new ArrayList();
    private ArrayList<Vraag> ToetsPeriode3 = new ArrayList();


    public Vak(String name, Integer toetsPeriode) {
        this.naam = name;
        this.toetsPeriode = toetsPeriode;
    }

    public ArrayList<Vraag> getToetsPeriode1() {
        return ToetsPeriode1;
    }

    public ArrayList<Vraag> getToetsPeriode2() {
        return ToetsPeriode2;
    }

    public ArrayList<Vraag> getToetsPeriode3() {
        return ToetsPeriode3;
    }

    public void addVraagPeriode1(Vraag vraag) {
        ToetsPeriode1.add(vraag);
    }

    public void addVraagPeriode2(Vraag vraag) {
        ToetsPeriode2.add(vraag);
    }

    public void addVraagPeriode3(Vraag vraag) {
        ToetsPeriode3.add(vraag);
    }

    public void removeVraagByID1(Integer ID) {
        for (Vraag vraag : ToetsPeriode1) {
            if (ID == vraag.getID()) {
                ToetsPeriode1.remove(vraag);
            }
        }
    }


    public void removeVraagByID2(Integer ID) {
        for (Vraag vraag : ToetsPeriode2) {
            if (ID == vraag.getID()) {
                ToetsPeriode2.remove(vraag);
            }
        }
    }

    public void removeVraagByID3(Integer ID) {
        for (Vraag vraag : ToetsPeriode3) {
            if (ID == vraag.getID()) {
                ToetsPeriode3.remove(vraag);
            }
        }
    }
    public ArrayList<Vraag> getShuffledToets1()
    {
        ArrayList<Vraag> Toets = new ArrayList<Vraag>();
        Toets = ToetsPeriode1;
        Collections.shuffle(Toets);
        return Toets;

    }
    public ArrayList<Vraag> getShuffledToets2()
    {
        ArrayList<Vraag> Toets = new ArrayList<Vraag>();
        Toets = ToetsPeriode2;
        Collections.shuffle(Toets);
        return Toets;

    }
    public ArrayList<Vraag> getShuffledToets3()
    {
        ArrayList<Vraag> Toets = new ArrayList<Vraag>();
        Toets = ToetsPeriode3;
        Collections.shuffle(Toets);
        return Toets;

    }



}
