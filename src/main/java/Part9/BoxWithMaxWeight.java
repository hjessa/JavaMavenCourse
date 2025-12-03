package Part9;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item){

    }

    public boolean isInBox(Item item){

    }

    public int getWeight(){
        int allWeight = 0;
        for (Item item : items) {
            allWeight += item.weight;
        }
    }
}
