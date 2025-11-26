package Part9;

public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity){
        if(capacity<= 0){
            this.capacity =0;
        }
        else {
            this.capacity=capacity;
        }

        this.balance = this.capacity;
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

        if(this.balance >= amount){
            this.balance-=amount;
        }else{
            this.balance=0;
        }
    }

    public double takeFromWarehouse(double amount){
        if(amount<= 0){
            return 0;
        }

        double spaceLoaded = this.capacity-this.balance;

        if(amount > spaceLoaded){
            this.balance = this.capacity;
            return spaceLoaded;
        }

    }
}
