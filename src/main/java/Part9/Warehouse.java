package Part9;

import java.text.MessageFormat;

public class Warehouse {

    private final double capacity;
    private double balance;

    public Warehouse(double capacity){
        if(capacity<= 0){
            this.capacity =0;
        }
        else {
            this.capacity=capacity;
        }

        this.balance = capacity;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double howMuchSpaceLeft(){
        return this.capacity -this.balance;
    }

    public void addToWarehouse(double amount){
        if(amount<= 0){
            return;
        }

        if(this.balance > amount){
            this.balance+=amount;
        }else{
            this.balance=this.capacity;
        }
    }

    public double takeFromWarehouse(double amount){
        if(amount<= 0){
            return 0;
        }

        if(amount >= this.balance){
            double balanceTemp = this.balance;
            this.balance = 0;
            return balanceTemp;
        }
        else{
            this.balance -=amount;
            return amount;
        }
    }

    public String toString(){
        return MessageFormat.format("balance  = {0} space left {1}",this.balance,this.capacity-this.balance);
    }
}
