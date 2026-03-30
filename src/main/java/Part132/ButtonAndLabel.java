package Part132;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Comparator;

public class ButtonAndLabel extends Application{

    public void start(Stage window) {

        BorderPane bp = new BorderPane();
        TextArea text = new TextArea();
        bp.setCenter(text);
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: 0");

        text.textProperty().addListener((change, oldValue, newValue) ->{
            int charLength = newValue.length();
            String []parts = newValue.split(" ");
            int wordsLength = parts.length;

            String longest = Arrays.stream(parts)
                    .filter(s -> !s.isEmpty())
                            .max(Comparator.comparingInt(String::length))
                                    .orElse("");

            letters.setText("Letters: "+String.valueOf(charLength));
            words.setText("Words: "+String.valueOf(wordsLength));
            longestWord.setText("The longest word is: "+String.valueOf(longest));

        });

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().add(letters);
        hbox.getChildren().add(words);
        hbox.getChildren().add(longestWord);

        bp.setBottom(hbox);


        Scene scene = new Scene(bp);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(Part132.ButtonAndLabel.class);
    }
}