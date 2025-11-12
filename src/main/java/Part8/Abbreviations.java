package Part8;

import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> abbreviation;

    public Abbreviations(){

        this.abbreviation = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){

        String key = sanitizedString(abbreviation);

        if(this.abbreviation.containsKey(key)){
            System.out.println("Key exist");
        }else{
            this.abbreviation.put(abbreviation,explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation){
        String key = sanitizedString(abbreviation);

        return this.abbreviation.containsKey(key);
    }

    public String findExplanationFor(String abbreviation){
        String key = sanitizedString(abbreviation);

            return this.abbreviation.get(key);

    }

    public String sanitizedString(String name){

        if(name == null){
            return "";
        }

        name = name.toLowerCase();
        return name.trim();
    }
}
