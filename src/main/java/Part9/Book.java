package Part9;

import java.text.MessageFormat;

public class Book implements Packable{

    private String author;
    private String title;
    private double weight;

    public Book(String author, String title, double weight){
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String toString(){
        return MessageFormat.format("{0}: {1}",this.author,this.title);
    }
}
