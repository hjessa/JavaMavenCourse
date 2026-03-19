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

    public ArrayList<Integer> sumsOfDiagonals(){
        ArrayList<Integer> sum = new ArrayList<>();

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

    public int[][] createMagicSquare(){
        int[][] ms = new int[3][3];

        //initializer
        int row = 0;
        int col = 1;
        int number = 1;
        while(true){
            if(ms[row][col] != 0){
                row--;
                col++;
            }else{
                ms[row][col] = number;
                number++;
                row--;
                col++;
            }

            if(row < 0){
                row = 2;
            }

            if(col == 2){
                col = 0;
            }

            this.sumsOfRows();
            this.sumsOfDiagonals();
            this.sumsOfColumns();

        }

        return magicSquare;
    }

}
