package Part9;

import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity, initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public String history(){
        return history.toString();
    }
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
//        this.history.add();
    }

    @Override
    public double takeFromWarehouse(double amount){
        double taken = super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        return taken;
    }
    public void printAnalysis(){
        System.out.println("History: "+this.history());
        System.out.println("Largest amount of product: "+this.history.maxValue());
        System.out.println("Smallest amount of product: "+this.history.minValue());
        System.out.println("Average: "+this.history.average());
    }


}
