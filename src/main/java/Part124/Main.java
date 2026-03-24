package Part124;

import java.util.Arrays;
import Part124.MagicSquareFactory;

public class Main {

    public static void main(String[] args){

        MagicSquare ms = MagicSquareFactory.createMagicSquare(3);
        assert ms != null;
        System.out.println(ms);
        System.out.println(ms.sumsOfColumns());
        System.out.println(ms.sumsOfRows());
        System.out.println(ms.sumsOfDiagonals());

    }


    public static String arrayAsString(int[][] array){

        StringBuilder row = new StringBuilder();
        for (int i = 0;i< array.length;i++){

            for (int j = 0;j< array[i].length;j++){
                row.append(array[i][j]);
            }
            row.append("\n");
        }
        return row.toString();
    }
}
