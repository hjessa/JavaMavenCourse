package Part134;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class UserTitle extends Application {

    public void start(Stage window){

        Parameters parameters = getParameters();

        TextArea ta = new TextArea();
        FlowPane fw = new FlowPane(ta);

        Scene scene = new Scene(fw);
        window.setTitle(parameters.getNamed().get("title"));
        window.setScene(scene);
        window.show();
    }

}
