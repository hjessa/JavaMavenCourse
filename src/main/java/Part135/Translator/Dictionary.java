package Part135.Translator;

import java.util.HashMap;
import java.util.Random;

public class Dictionary {

    private HashMap<String,String> dictionary;

    public Dictionary(){
        this.dictionary = new HashMap<>();
    }

    public void addTranslation(String word, String translation){

        if(!this.dictionary.containsKey(word)){
            this.dictionary.putIfAbsent(word,translation);
        }
        if(!this.dictionary.containsKey(translation)){
            this.dictionary.putIfAbsent(translation,word);
        }
    }

    public String getTranslation(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        return null;
    }

    public String getRandomWord(){
        Random randInt = new Random();
        int randomNumber = randInt.nextInt(0,this.dictionary.size());
        int i = 0;

        for (String value : dictionary.values()) {
            if(i == randomNumber){
                return value;
            }
            i++;
        }

        return null;
    }
}
