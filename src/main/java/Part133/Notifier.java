package Part133;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Notifier extends Application {

    public void start(Stage window){
        TextField input = new TextField();
        Button update = new Button("Update");
        Label label = new Label();

        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(input, update, label);

        update.setOnAction((event) -> {
            label.setText(input.getText());
        });

        Scene scene = new Scene(componentGroup);
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args){
        launch(Part133.Notifier.class);
    }
}
