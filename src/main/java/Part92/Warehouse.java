package Part92;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productsPrize;
    private Map<String, Integer> productsStock;

    public Warehouse(){
        this.productsPrize = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){

        if(!this.productsPrize.containsKey(product)){
            this.productsPrize.put(product,price);
        }

        if(!this.productsStock.containsKey(product)){
            this.productsStock.put(product,stock);
        }
    }

    public int price(String product){
        if(this.productsPrize.containsKey(product)){
            return this.productsPrize.get(product);
        }

        return -99;
    }

    public int stock(String product){
        if(this.productsStock.containsKey(product)){
            return this.productsStock.get(product);
        }

        return 0;
    }

    public boolean take(String product){
        if(this.productsStock.containsKey(product)){
            if(this.productsStock.get(product)>0){
                this.productsStock.replace(product,this.productsStock.get(product)-1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products(){
        return this.productsStock.keySet();
    }
}
