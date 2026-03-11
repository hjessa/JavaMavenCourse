package Part121;

import java.util.ArrayList;

public class Pipe<T>{

    private ArrayList<T> pipe;

    public Pipe(){
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.pipe.add(value);
    }

    public T takeFromPipe(){
        if(!this.pipe.isEmpty()){
            T val = this.pipe.get(0);
            this.pipe.remove(0);
            return val;
        }else {
            return null;
        }
    }

    public boolean isInPipe(){
        return !this.pipe.isEmpty();
    }
}
