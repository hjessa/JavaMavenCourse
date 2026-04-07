package Part135.Translator;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VocabularyInterface extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        Dictionary dc = new Dictionary();
        InputView iv = new InputView(dc);
        PracticeView pv = new PracticeView(dc);

        Button newWord = new Button("Enter new words");
        Button practice = new Button("Practice");

        BorderPane layout = new BorderPane();
        HBox buttons = new HBox();
        buttons.getChildren().addAll(newWord,practice);

        layout.setTop(buttons);
        layout.setCenter(iv.getView());

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();

        newWord.setOnMouseClicked(mouseEvent -> {
            layout.setCenter(iv.getView());
        });

        practice.setOnMouseClicked(mouseEvent -> {
            layout.setCenter(pv.getView());
        });
    }
}
