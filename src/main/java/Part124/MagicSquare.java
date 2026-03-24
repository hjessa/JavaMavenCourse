package Part124;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MagicSquare {

    private final int[][] magicSquare;

    public MagicSquare(int[][] magicSquare){
        this.magicSquare = magicSquare;
    }

    public List<Integer> sumsOfRows(){
        List<Integer> sum = new ArrayList<>();

        for (int[] ints : magicSquare) {
            int sumToAdd =0;
            for (int anInt : ints) {
                sumToAdd+=anInt;
            }
            sum.add(sumToAdd);
        }

        return sum;
    }

    public List<Integer> sumsOfColumns(){
        List<Integer> sum = new ArrayList<>();

            for (int col = 0; col < magicSquare.length; col++) {
                int colVal = 0;
                for (int i = 0; i < magicSquare.length; i++) {
                    int cell = magicSquare[i][col];
                    colVal += cell;
                }
                sum.add(colVal);
            }

        return sum;
    }

    public List<Integer> sumsOfDiagonals(){
        List<Integer> sum = new ArrayList<>();

        //0:0 1:1 2:2
        //2:0 1:1 0:2
        int diagonalSum = 0;

        for (int i = 0; i < magicSquare.length; i++) {
            int cell = magicSquare[i][i];
            diagonalSum +=cell;
        }
        sum.add(diagonalSum);
        diagonalSum = 0;
        int col = magicSquare.length -1;
        for (int i = 0; i < magicSquare.length; i++) {

            int cell = magicSquare[i][col];
            col--;
            diagonalSum +=cell;
        }
        sum.add(diagonalSum);

        return sum;
    }

    public String toString(){
        return java.util.Arrays.deepToString(magicSquare);
    }

}
