package Part135.TicTacToe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Logic {


    public static void putSign(Button button, Label label, String[][] plan, BorderPane layout){
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
                layout.setDisable(true);
                layout.setOpacity(0.7);
            }


        }));
    }

    public static boolean checkWin(String[][] plan){

        return checkCol(plan) || checkRow(plan) || checkDiag(plan);
    }

    public static boolean checkRow(String[][] plan){
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
        return false;
    }

    public static boolean checkCol(String[][] plan){
        for(int col = 0; col < plan.length;col++){
            StringBuilder colResult = new StringBuilder();

            for (String[] strings : plan) {
                colResult.append(strings[col]);
            }
            if(colResult.toString().equals("XXX") || colResult.toString().equals("000") ){
                return true;
            }

            colResult = new StringBuilder();
        }
        return false;
    }

    public static boolean checkDiag(String[][] plan){
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
        return diagResult2.toString().equals("XXX") || diagResult2.toString().equals("000");
    }



}
