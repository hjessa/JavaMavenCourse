package Part93;

import java.util.ArrayList;

public class Herd implements Movable{

    private ArrayList<Movable> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable movable : herd) {
            sb.append(movable).append("\n");
        }
        return sb.toString();
    }

    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx,dy);
        }
    }
}
