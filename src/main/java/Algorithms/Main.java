package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);

        System.out.println(numbers);
        sortIntegers(numbers);
        System.out.println(numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("abc");
        words.add("fgh");
        words.add("de");

        System.out.println(words);
        sortStrings(words);
        System.out.println(words);

        int[] numbers2 = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers2));
        sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        String[] word = {"H", "U", "B", "E", "R", "T"};
        System.out.println(Arrays.toString(word));
        sort(word);
        System.out.println(Arrays.toString(word));

    }

    public static void sort(int[] array){
        Arrays.sort(array);
    }

    public static void sort(String[] array){
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
}
