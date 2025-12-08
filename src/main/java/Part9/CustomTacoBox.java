package Part9;

public class CustomTacoBox implements TacoBox{

    public int tacos;

    public CustomTacoBox(int tacos){
        this.tacos = tacos;
    }


    public void eat(){
        this.tacos -= 1;
    }

    public int tacosRemaining(){
        return this.tacos;
    }
}
