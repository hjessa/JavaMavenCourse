package Part92;

import java.text.MessageFormat;

public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;


    }

    public int price(){
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity(){
        this.qty++;
    }

    public String toString(){
        return MessageFormat.format("{0}: {1}",this.product,this.qty);
    }

    public boolean equals(Object object){

        if(this == object){
            return true;
        }

        if(object!=null && object.getClass() == this.getClass()){

            Item compared = (Item) object;

            return compared.product.equals(this.product);

        }

        return false;
    }
}
