package Part135;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Joke extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        //3buttony , 3 teksty
        //3 sceny

        Label question = new Label("What do you call a bear with no teeth?");
        Label answer = new Label("A gummy bear.");
        Label explanation = new Label("Chuj wi");

        Button first = new Button("Joke");
        Button second = new Button("Answer");
        Button third = new Button("Explanation");

        BorderPane layout = new BorderPane();
        layout.setPrefSize(300,300);
        HBox buttons = new HBox();
        buttons.getChildren().addAll(first,second,third);

        StackPane firstScreen = new StackPane(question);
        StackPane secondScreen = new StackPane(answer);
        StackPane thirdScreen = new StackPane(explanation);

        layout.setTop(buttons);
        layout.setCenter(firstScreen);

        Scene scene = new Scene(layout);

        first.setOnAction((event) -> {
            layout.setCenter(firstScreen);
        });

        second.setOnAction((event) -> {
            layout.setCenter(secondScreen);
        });

        third.setOnAction((event) -> {
            layout.setCenter(thirdScreen);
        });

        stage.setScene(scene);
        stage.show();


    }
}
