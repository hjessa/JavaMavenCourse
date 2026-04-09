package Part135.TicTacToe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Logic {


    public static void putSign(Button button, Label label,String[][] plan){
        button.setOnMouseClicked((mouseEvent -> {
            if(!button.getText().isEmpty()){
                return;
            }

            int row = GridPane.getRowIndex(button);
            int col = GridPane.getColumnIndex(button);

            String turn = label.getText().split(" ")[1];
            if(turn.equals("X")){
                button.setText("X");
                label.setText("Turn: 0");
                plan[row][col] = "X";
            }else{
                button.setText("0");
                label.setText("Turn: X");
                plan[row][col] = "0";
            }

            if(checkWin(plan)){
                label.setText("Wygrałeś już - nice one");
            }


        }));
    }

    public static boolean checkWin(String[][] plan){
        StringBuilder result = new StringBuilder();
        //Iterowanie po wierszach
        for (String[] strings : plan) {

            for (String string : strings) {
                result.append(string);
            }

            if(result.toString().equals("XXX") || result.toString().equals("000") ){
                return true;
            }

            result = new StringBuilder();
        }
        //Iterowanie po kolumnach

        for(int col = 0; col < plan.length;col++){
            StringBuilder colResult = new StringBuilder();

            for(int row = 0; row < plan.length;row++){
                colResult.append(plan[row][col]);
            }
            if(colResult.toString().equals("XXX") || colResult.toString().equals("000") ){
                return true;
            }

            colResult = new StringBuilder();
        }


        //Iterowanie po diagonalach - 1
        StringBuilder diagResult1 = new StringBuilder();
        int col = 0;
        int row = 0;
        for (int i = 0; i< plan.length;i++){
            col = i;
            row = i;
            diagResult1.append(plan[row][col]);
        }
        if(diagResult1.toString().equals("XXX") || diagResult1.toString().equals("000") ){
            return true;
        }

        //Iterowanie po diagonalach - 2
        StringBuilder diagResult2 = new StringBuilder();
        col = plan.length-1;
        row = 0;

        for (int i = 0; i< plan.length;i++){
            diagResult2.append(plan[row][col]);
            col--;
            row++;
        }
        if(diagResult2.toString().equals("XXX") || diagResult2.toString().equals("000") ){
            return true;
        }

        return false;
    }

}
