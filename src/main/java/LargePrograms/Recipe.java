package LargePrograms;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}, cooking time {1}",this.name,this.time);
    }
}
