package Part114;

import Part114.dictionary.SaveableDictionary;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        SaveableDictionary dictionary = new SaveableDictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("ohjelmointi", "programming");
//        dictionary.delete("apina");
//        dictionary.delete("banana");
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("monkey"));
//        System.out.println(dictionary.translate("banana"));
//        System.out.println(dictionary.translate("banaani"));
//        System.out.println(dictionary.translate("ohjelmointi"));

        SaveableDictionary dictionary = new SaveableDictionary("C:\\Users\\hubert\\IdeaProjects\\JavaLearningMaven\\src\\main\\java\\Part114\\dictionary\\words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));

        dictionary.add("banaani", "banana");

        dictionary.save();
        System.out.println("--------------------------------------------------------------");
        dictionary.load();
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        System.out.println(dictionary.translate("banaani"));

    }
}
