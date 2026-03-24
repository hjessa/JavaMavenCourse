package Part124;

public class MagicSquareFactory {

    public static MagicSquare createMagicSquare(int length){

        if(length %2 == 0){
            return null;
        }

        int[][] ms = new int[length][length];

        int row = 0;
        int col = length/2;
        int num = 1;
        int index = 0;

        ms[row][col] = num;
        num++;
        while(index < (length*length)-1) {

            //Najpierw sprawdzić jakie sa kordy dopuszczalne
            int potentialRow = row;
            int potentialCol = col;

            if (potentialRow == 0) {
                potentialRow = length-1;
            } else {
                potentialRow--;
            }

            if (potentialCol == length-1) {
                potentialCol = 0;
            } else {
                potentialCol++;
            }

            if (ms[potentialRow][potentialCol] != 0) {
                if(row == length -1){
                    row = 0;
                }else {
                    row++;
                }
                ms[row][col] = num;
                num++;
            } else {
                row = potentialRow;
                col = potentialCol;
                ms[row][col] = num;
                num++;
            }

            index++;
        }
        return new MagicSquare(ms);
    }
}
