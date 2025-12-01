package Part9;

import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public String history(){
        return history.toString();
    }


}
