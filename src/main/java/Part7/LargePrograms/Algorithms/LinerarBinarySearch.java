package Part7.LargePrograms.Algorithms;

import java.util.Arrays;

public class LinerarBinarySearch {

    public static void main(String[] args){
        int[] numbers2 = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(linearSearch(numbers2,9));

        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        System.out.println(binarySearch(numbers2,9));

    }

    public static int linearSearch(int[] array, int searchedId){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == searchedId){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int searchedId) {

        int begin = 0;
        int end = array.length;
        int middle = 0;

        for (int i = begin; i <end ; i++) {
            middle = (end + begin) / 2;

            if(array[middle]==searchedId){
                return middle;
            }

            if(array[middle]<searchedId){
                begin = middle +1;
            }

            if(array[middle]>searchedId){
                end = middle-1;
            }
        }

        return -1;
    }
}
