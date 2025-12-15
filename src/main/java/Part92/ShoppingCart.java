package Part92;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart(){
        items = new ArrayList<>();
    }

    public void add(String product, int price){

        Item toAdd = new Item(product,1,price);

        for (Item item : items) {
            if(item.equals(toAdd)){
                item.increaseQuantity();
                return;
            }
        }

        this.items.add(toAdd);
    }

    public int price(){
        int totalPrize = 0;
        for (Item item : items) {
            totalPrize += item.price();
        }

        return totalPrize;
    }

    public void print(){
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
