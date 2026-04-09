package Part135.TicTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class UI extends Application {



    @Override
    public void start(Stage stage) throws Exception {

        String[][] plan = new String[3][3];

        Label topText = new Label("Turn: X");
        topText.setFont(Font.font("Arial", 40));

        Button left1 = new Button("");
        left1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        left1.setFont(Font.font("Monospaced", 40));

        Button left2 = new Button("");
        left2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        left2.setFont(Font.font("Monospaced", 40));

        Button left3 = new Button("");
        left3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        left3.setFont(Font.font("Monospaced", 40));

        Button center1 = new Button("");
        center1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        center1.setFont(Font.font("Monospaced", 40));

        Button center2 = new Button("");
        center2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        center2.setFont(Font.font("Monospaced", 40));

        Button center3 = new Button("");
        center3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        center3.setFont(Font.font("Monospaced", 40));

        Button right1 = new Button("");
        right1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        right1.setFont(Font.font("Monospaced", 40));

        Button right2 = new Button("");
        right2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        right2.setFont(Font.font("Monospaced", 40));

        Button right3 = new Button("");
        right3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        right3.setFont(Font.font("Monospaced", 40));

        BorderPane layout = new BorderPane();
        layout.setTop(topText);

        GridPane matrix = new GridPane();
        GridPane.setFillHeight(left1, true);
        GridPane.setFillWidth(left1, true);

        GridPane.setFillHeight(left2, true);
        GridPane.setFillWidth(left2, true);

        GridPane.setFillHeight(left3, true);
        GridPane.setFillWidth(left3, true);

        GridPane.setFillHeight(center1, true);
        GridPane.setFillWidth(center1, true);

        GridPane.setFillHeight(center2, true);
        GridPane.setFillWidth(center2, true);

        GridPane.setFillHeight(center3, true);
        GridPane.setFillWidth(center3, true);

        GridPane.setFillHeight(right1, true);
        GridPane.setFillWidth(right1, true);

        GridPane.setFillHeight(right2, true);
        GridPane.setFillWidth(right2, true);

        GridPane.setFillHeight(right3, true);
        GridPane.setFillWidth(right3, true);

        ColumnConstraints col = new ColumnConstraints();
        col.setPrefWidth(100);  // preferowana szerokość
        col.setMinWidth(100);   // minimalna (blokuje kurczenie)
        col.setMaxWidth(100);   // maksymalna (blokuje rozszerzanie)

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPrefWidth(100);  // preferowana szerokość
        col1.setMinWidth(100);   // minimalna (blokuje kurczenie)
        col1.setMaxWidth(100);   // maksymalna (blokuje rozszerzanie)

        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPrefWidth(100);  // preferowana szerokość
        col2.setMinWidth(100);   // minimalna (blokuje kurczenie)
        col2.setMaxWidth(100);   // maksymalna (blokuje rozszerzanie)

        RowConstraints row = new RowConstraints();
        row.setMaxHeight(100);
        row.setMinHeight(100);
        row.setPrefHeight(100);
        RowConstraints row1 = new RowConstraints();
        row1.setMaxHeight(100);
        row1.setMinHeight(100);
        row1.setPrefHeight(100);
        RowConstraints row2 = new RowConstraints();
        row2.setMaxHeight(100);
        row2.setMinHeight(100);
        row2.setPrefHeight(100);

        matrix.getColumnConstraints().addAll(col,col1,col2);
        matrix.getRowConstraints().addAll(row,row1,row2);


        matrix.setHgap(10);
        matrix.setVgap(10);
        matrix.add(left1,0,0);
        matrix.add(left2,0,1);
        matrix.add(left3,0,2);
        matrix.add(center1,1,0);
        matrix.add(center2,1,1);
        matrix.add(center3,1,2);
        matrix.add(right1,2,0);
        matrix.add(right2,2,1);
        matrix.add(right3,2,2);

        layout.setCenter(matrix);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();

        Logic.putSign(left1,topText,plan);
        Logic.putSign(left2,topText,plan);
        Logic.putSign(left3,topText,plan);
        Logic.putSign(center1,topText,plan);
        Logic.putSign(center2,topText,plan);
        Logic.putSign(center3,topText,plan);
        Logic.putSign(right1,topText,plan);
        Logic.putSign(right2,topText,plan);
        Logic.putSign(right3,topText,plan);

    }

//    public static void putSign(Button button, Label label){
//        button.setOnMouseClicked((mouseEvent -> {
//            if(!button.getText().isEmpty()){
//                return;
//            }
//
//            String turn = label.getText().split(" ")[1];
//            if(turn.equals("X")){
//                button.setText("X");
//                label.setText("Turn: 0");
//            }else{
//                button.setText("0");
//                label.setText("Turn: X");
//            }
//        }));
//    }
}
