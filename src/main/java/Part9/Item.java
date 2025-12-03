package Part9;

public class Item {

    private String name;
    private int weight;

    public Item(String name,int weight){
        this.name = name;
        this.weight = weight;
    }

    public boolean equals(Object object){

        if(object == this){
            return true;
        }

        if(object != null && object.getClass() == this.getClass()){

            Item newObject = (Item) object;

            return this.name.equals(newObject.name);

        }
        return false;
    }

    public int hashCode(){
        return this.name.hashCode();
    }

    public
}
