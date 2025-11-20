package Part8;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }

    public void add(String unit,String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        return this.storage.getOrDefault(storageUnit,new ArrayList<>());
    }

    public void remove(String storageUnit, String item){

        if(this.storage.containsKey(storageUnit)){
            ArrayList<String> items = this.storage.get(storageUnit);
            items.remove(item);
            if(items.isEmpty()){
                this.storage.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits(){

        ArrayList<String> keys = new ArrayList<>();

        for (String s : storage.keySet()) {
            if(!this.storage.get(s).isEmpty()){
                keys.add(s);
            }
        }

        return keys;
    }

    public static void main(String[] args){
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
    }
}
