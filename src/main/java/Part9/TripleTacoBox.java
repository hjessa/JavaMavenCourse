package Part9;

public class TripleTacoBox implements TacoBox{

    public int tacos;

    public TripleTacoBox(){
        this.tacos = 3;
    }


    public void eat(){
        this.tacos -= 1;
    }

    public int tacosRemaining(){
        return this.tacos;
    }
}
