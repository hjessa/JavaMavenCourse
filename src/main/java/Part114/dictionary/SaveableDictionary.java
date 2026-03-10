package Part114.dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private Map<String,String> dictionary;
    private String file;

    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this();
        this.file = file;
    }

    public void add(String words, String translation){
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }

        return null;
    }

    public void delete(String word){

        String translation = this.translate(word);

        if(translation != null){
            dictionary.remove(word);
            dictionary.remove(translation);
        }
    }


    public boolean load() throws IOException {
        try(Scanner fileReader = new Scanner(Paths.get(file))){

            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0],parts[1]);

            }

            return true;
        } catch (Exception e) {
            System.out.println("Error "+e);
            return false;
        }
    }

    public boolean save() {
        try (FileWriter fw = new FileWriter(this.file)) {

            for (String word : dictionary.keySet()) {
                String translation = dictionary.get(word);

                if (word.compareTo(translation) <= 0) {
                    fw.write(word + ":" + translation + "\n");
                }
            }

            return true;

        } catch (Exception e) {
            return false;
        }
    }

}
