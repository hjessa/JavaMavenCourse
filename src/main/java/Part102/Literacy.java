package Part102;

import java.text.MessageFormat;

public class Literacy implements Comparable<Literacy> {

    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;

    public Literacy(String theme, String ageGroup, String gender, String country, int year, double literacyPercent){
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    public String toString(){
        return MessageFormat.format("{0} ({1}), {2}, {3}",this.country,this.year,this.gender,this.literacyPercent);
    }

    public int compareTo(Literacy literacy){
        return Double.compare(this.literacyPercent, literacy.literacyPercent);
    }

}
