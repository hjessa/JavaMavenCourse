package Part9;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Box{

    private ArrayList<Packable> items;
    private double capacity;
    private double totalWeight;

    public Box(double capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
        this.totalWeight = 0;
    }

    public void add(Packable item){

        if(this.capacity - this.totalWeight >= item.weight()){
            this.items.add(item);
            this.totalWeight += item.weight();
        }
    }

    public String toString(){
        return MessageFormat.format("Box: {0}, total weight {1}kg",this.items.size(),this.totalWeight);
    }
}