package Part135;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {

        Label instruction = new Label("Enter your name and start");
        TextField name = new TextField();
        Button start = new Button("Start");

        GridPane layout = new GridPane();

        layout.add(instruction, 0, 0);
        layout.add(name, 0, 1);
        layout.add(start, 0, 2);

        // 1.3 styling the layout
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        BorderPane secondLayout = new BorderPane();
        Label welcome = new Label();
        secondLayout.setCenter(welcome);
        secondLayout.setPrefSize(300,200);

        Scene login = new Scene(layout);
        Scene second = new Scene(secondLayout);

        window.setScene(login);
        window.show();

        start.setOnAction((actionEvent -> {
            welcome.setText("Welcome "+name.getText());
            window.setScene(second);
        }
        ));

    }
}
