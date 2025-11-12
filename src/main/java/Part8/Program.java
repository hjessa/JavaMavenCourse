package Part8;

import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String,String> hashmap){
        System.out.println(hashmap.keySet());
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for (String s : hashmap.keySet()) {
            if(s.contains(text)){
                System.out.println(s);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (String s : hashmap.keySet()) {
            if(s.contains(text)){
                System.out.println(hashmap.get(s));
            }
        }
    }

    public static void printValues(HashMap<String,Book> hashmap){
        for (Book value : hashmap.values()) {
            System.out.println(value);
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (Book book : hashmap.values()) {
            if(book.getName().contains(text)){
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args){
//        HashMap<String, String> hashmap = new HashMap<>();
//        hashmap.put("f.e", "for example");
//        hashmap.put("etc.", "and so on");
//        hashmap.put("i.e", "more precisely");
//
//        printKeys(hashmap);
//        System.out.println("---");
//        printKeysWhere(hashmap, "i");
//        System.out.println("---");
//        printValuesOfKeysWhere(hashmap, ".e");

        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

}
