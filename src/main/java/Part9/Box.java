package Part9;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Box implements Packable{

    private ArrayList<Packable> items;
    private double capacity;
//    private double totalWeight;

    public Box(double capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item){

        if(this.capacity - this.weight() >= item.weight()){
            this.items.add(item);
        }
    }

    public double weight(){

        double weight = 0;

        for (Packable item : items) {
            weight += item.weight();
        }

        return weight;
    }

    public String toString(){
        return MessageFormat.format("Box: {0}, total weight {1}kg",this.items.size(),this.weight());
    }
}