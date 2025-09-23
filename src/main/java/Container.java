import java.text.MessageFormat;

public class Container {

    private int amount;

    public Container(){
        this.amount = 0;
    }

    public int contains() {
        return amount;
    }

    public void add(int amount){
        if(amount>0){
            if(amount+this.amount >100){
                this.amount = 100;
            }
            else {
                this.amount += amount;
            }
        }
    }

    public void remove(int amount){
        if(amount>0){
            if(this.amount - amount <0){
                this.amount = 0;
            }
            else {
                this.amount -=amount;
            }
        }
    }

    public void move(int amount, Container second){

        if(amount>=this.amount) {

            if (amount + second.amount >= 100) {
                second.amount = 100;
            } else {
                second.amount += amount;
            }
            this.amount = 0;
        }
        else{
            if(amount+second.amount>=100){
                second.amount = 100;
            }
            else{
                second.amount += amount;
            }
            this.amount -=amount;

        }
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}/100",this.amount);
    }
}
