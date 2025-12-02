package Part9;

import java.text.MessageFormat;

public class ProductWarehouse extends Warehouse {

    private String productName;

    public ProductWarehouse(String productName,double capacity){
        super(capacity);
        this.productName = productName;
    }

    public ProductWarehouse(String productName,double capacity, double initialBalance){
        super(capacity,initialBalance);
        this.productName = productName;
    }


    public String getName(){
        return this.productName;
    }

    public void setName(String newName){
        this.productName = newName;
    }

    @Override
    public String toString(){
        return this.getName() +" "+ super.toString();
    }

}
