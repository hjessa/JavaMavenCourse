package Part124;

import java.sql.SQLOutput;
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

        int i = ms[0].length * ms.length;
        //initializer
        int row = 0;
        int col = 1;
        int number = 1;
        int index = 0;
        while(index < i){
            System.out.println("Kolumna "+col);
            System.out.println("Wiersz "+row);
            if(ms[row][col] != 0){
                switch (row){
                    case 0,1:
                        row++;
                        break;
                    case 2:
                        row =1;
                        break;
                }
                ms[row][col] = number;
                System.out.println("Wstawiłem liczbę "+number+" w kolumne "+col+" i wiersz "+row);
                number++;
            }else{
                ms[row][col] = number;
                System.out.println("Wstawiłem liczbę "+number+" w kolumne "+col+" i wiersz "+row);
                number++;

                int newRow;
                int newCol;

                switch(row){
                    case 0:
                        newRow =2;
                        break;
                    case 1:
                        newRow =0;
                        break;
                    case 2:
                        newRow = 1;
                        break;
                }

                switch(col){
                    case 0:
                        newCol =1;
                        break;
                    case 1:
                        newCol =2;
                        break;
                    case 2:
                        newCol = 0;
                        break;
                }

            }
            index++;

        }

        return ms;
    }

}
