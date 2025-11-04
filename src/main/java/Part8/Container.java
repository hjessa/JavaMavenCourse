package Part8;

import java.text.MessageFormat;

public class Container {

    private int cap;
    private int liquid;

    public Container(){
        this.cap = 100;
        this.liquid = 0;
    }

    public int getLiquid() {
        return liquid;
    }

    public void setLiquid(int amount){
        if(this.liquid + amount >= 100){
            this.liquid = 100;
        }else{
            this.liquid+=amount;
        }

    }

    public void moveLiquid(int amount, Container second){
        if(amount >= this.liquid){
            second.setLiquid(this.liquid);
            this.remove(amount);
        }else if(amount>0) {
            second.setLiquid(amount);
            this.remove(amount);
        }
    }

    public void remove(int amount){
        if(this.liquid - amount <= 0){
            this.liquid = 0;
        }else {
            this.liquid -=amount;
        }
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}/{1}",this.liquid,this.cap);
    }
}
