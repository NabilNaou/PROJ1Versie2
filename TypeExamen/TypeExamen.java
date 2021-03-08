public class TypeExamen {
    private Integer Id;
    private String theorieExamen;
    private String praktijkExamen;

    public TypeExamen(Integer id, String theorieExamen, String praktijkExamen) {
        this.Id = id;
        this.theorieExamen = theorieExamen;
        this.praktijkExamen = praktijkExamen;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
