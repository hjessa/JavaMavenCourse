package Part102;

import java.text.MessageFormat;
import java.util.Comparator;

public class Book implements Comparable<Book> {

    private String name;
    private int ageReccomendation;

    public Book(String name, int reco){
        this.name = name;
        this.ageReccomendation = reco;
    }

    public String getName() {
        return name;
    }

    public int getAgeReccomendation() {
        return ageReccomendation;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} (recommended for {1} year-olds or older)",this.name, this.ageReccomendation);
    }

    public int compareTo(Book book){
        return this.ageReccomendation - book.ageReccomendation;
    }
}
