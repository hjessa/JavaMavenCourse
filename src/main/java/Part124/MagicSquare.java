package Part124;

import java.util.ArrayList;

public class MagicSquare {

    private int[][] magicSquare;

    public MagicSquare(int[][] magicSquare){
        this.magicSquare = magicSquare;
    }

    public ArrayList<Integer> sumsOfRows(){
        ArrayList<Integer> sum = new ArrayList<>();

        for (int[] ints : magicSquare) {
            int sumToAdd =0;
            for (int anInt : ints) {
                sumToAdd+=anInt;
            }
            sum.add(sumToAdd);
        }

        return sum;
    }

    public ArrayList<Integer> sumsOfColumns(){
        ArrayList<Integer> sum = new ArrayList<>();
        int pointer = 0;
        for (int i = 0; i < magicSquare.length; i++) {
            for (int col = 0; col < magicSquare[i].length; col++) {

                int a = magicSquare[0][0];
            }
        }

        return sum;
    }

}
