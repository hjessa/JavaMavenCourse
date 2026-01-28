package Part102;

import java.text.MessageFormat;

public class Book {

    private String name;
    private int ageReccomendation;

    public Book(String name, int reco){
        this.name = name;
        this.ageReccomendation = reco;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} (recommended for {1} year-olds or older)",this.name, this.ageReccomendation);
    }
}
