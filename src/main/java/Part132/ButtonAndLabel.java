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

public class ButtonAndLabel extends Application{

    public void start(Stage window) {

        BorderPane bp = new BorderPane();
        bp.setCenter(new TextArea(""));

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().add(new Label("Letters: 0"));
        hbox.getChildren().add(new Label("Words: 0"));
        hbox.getChildren().add(new Label("The longest word is: "));

        bp.setBottom(hbox);

        Scene scene = new Scene(bp);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(Part132.ButtonAndLabel.class);
    }
}