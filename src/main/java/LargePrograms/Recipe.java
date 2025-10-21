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

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public void findName(String input){
        if(this.name.contains(input)){
            System.out.println(this);
        }
    }

    public void findTime(int input){
        if(this.time >= input){
            System.out.println(this);
        }
    }

    public void findIngredient(String input){
        for (String ingredient : this.ingredients) {
            if(ingredient.equals(input)){
                System.out.println(this);
            }
        }
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}, cooking time {1}",this.name,this.time);
    }
}
