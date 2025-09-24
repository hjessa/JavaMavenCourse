package Algorithms;

import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args){

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
//        int[] numbers = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));
//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println("Smallest: " + MainProgram.smallest(numbers));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }

    public static int smallest(int [] array){

        int smallest = array[0];
        for (int i : array) {
            if(i<smallest){
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {

            if(array[i]<smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {

            if(table[i]<smallest){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int bufor = array[index1];
        array[index1] = array[index2];
        array[index2] = bufor;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            swap(array,i,indexOfSmallestFrom(array,i));
            System.out.println(Arrays.toString(array));
        }

    }
}
