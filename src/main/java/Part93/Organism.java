package Part93;

import java.text.MessageFormat;

public class Organism implements Movable{

    private int x;
    private int y;

    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return MessageFormat.format("X: {0}; Y: {1}",this.x,this.y);
    }

    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }


}
