package Part135;

import Part111.B;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public void start(Stage window){

        TextField firstText = new TextField("First View!");
        Button firstButton = new Button("To the second view!");
        TextField secondText = new TextField("Second View!");
        Button secondButton = new Button("To the third view");
        TextField thirdText = new TextField("Third View!");
        Button thirdButton = new Button("To the first view!");

        BorderPane firstPane = new BorderPane();
        firstPane.setTop(firstText);
        firstPane.setCenter(firstButton);

        VBox secondPane = new VBox();
        secondPane.getChildren().add(secondButton);
        secondPane.getChildren().add(secondText);

        GridPane thirdPane = new GridPane();
        thirdPane.add(thirdText,0,0);
        thirdPane.add(thirdButton,1,1);


        Scene first = new Scene(firstPane);
        Scene second = new Scene(secondPane);
        Scene third = new Scene(thirdPane);

        window.setScene(first);
        window.show();

        firstButton.setOnAction((event) ->
                {
                    window.setScene(second);
                }
        );

        secondButton.setOnAction((event) ->
                {
                    window.setScene(third);
                }
        );

        thirdButton.setOnAction((event) ->
                {
                    window.setScene(first);
                }
        );
    }
}
