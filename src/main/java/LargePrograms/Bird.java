package LargePrograms;

import java.text.MessageFormat;

public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public void setObservations(){
        this.observations++;
    }

    public boolean findName(String input){
        return this.name.equals(input);
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}, ({1}): {2} observations",this.name, this.latinName, this.observations);
    }
}
