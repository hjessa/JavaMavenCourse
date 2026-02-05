package Part103;

public enum Education {
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");

    public String grade;

    private Education(String grade){
        this.grade = grade;
    }


}
