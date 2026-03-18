package Part124;

public class Main {

    public static void main(String[] args){

        int[][] matrix = {
                {3, 2, 7, 6},
                {2, 4, 1, 0},
                {3, 2, 1, 0}
        };

        MagicSquare ms = new MagicSquare(matrix);
        System.out.println(ms.sumsOfRows());

//        System.out.println(arrayAsString(matrix));
//        int rows = 2;
//        int columns = 3;
//        int[][] matrix = new int[rows][columns];
//        matrix[0][1] = 5;
//        matrix[1][0] = 3;
//        matrix[1][2] = 7;
//        System.out.println(arrayAsString(matrix));
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
