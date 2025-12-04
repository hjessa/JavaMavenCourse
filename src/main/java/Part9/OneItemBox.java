package Part9;

import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> items;

    public OneItemBox(){
        this.items = new ArrayList<>();
    }

    public void add(Item item){
        if(this.items.isEmpty()){
            items.add(item);
        }
    }

    public boolean isInBox(Item item){
        if(this.items.contains(item)){
            return true;
        }
        return false;
    }

}
