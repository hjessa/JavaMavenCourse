package Part9;

import java.text.MessageFormat;

public class CD implements Packable{

    private String artist;
    private String cdName;
    private int year;

    public CD(String artist, String cdName, int year){
        this.artist = artist;
        this.cdName = cdName;
        this.year = year;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    public String toString(){
        return MessageFormat.format("{0}: {1} ({2})",this.artist,this.cdName,this.year);
    }
}
