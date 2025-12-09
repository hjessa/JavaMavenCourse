//package Part9;
//
//import java.util.ArrayList;
//
//public class BoxWithMaxWeight extends Box{
//
//    private int capacity;
//    private ArrayList<Item> items;
//
//    public BoxWithMaxWeight(int capacity){
//        this.capacity = capacity;
//        this.items = new ArrayList<>();
//    }
//
//    public void add(Item item){
//        if(capacity - this.getWeight() >= item.getWeight()){
//            this.items.add(item);
//        }
//    }
//
//    public boolean isInBox(Item item){
//        if(this.items.contains(item)){
//            return true;
//        }
//        return false;
//    }
//
//    public int getWeight(){
//        int allWeight = 0;
//        for (Item item : items) {
//            allWeight += item.getWeight();
//        }
//        return allWeight;
//    }
//}
