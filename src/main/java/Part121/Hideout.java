package Part121;

import java.util.ArrayList;

public class Hideout<T>{

    private T hideout;
    public Hideout(){

    }

    public void putIntoHideout(T toHide){
        this.hideout = toHide;
    }

    public T takeFromHideout(){
        if(this.hideout == null){
            return null;
        }
        else{
            T toRemember = this.hideout;
            this.hideout = null;
            return toRemember;
        }
    }

    public boolean isInHideout(){
        return this.hideout != null;
    }

}
