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

        Button newWord = new Button("Enter new words");
        Button practice = new Button("Practice");
        Button add = new Button("Add new pair");
        Button check = new Button("Check translation");

        Label word = new Label("Word");
        Label translation = new Label("Translation");
        Label translateTheWord = new Label();

        TextField wordtf = new TextField();
        TextField translationtf = new TextField();
        TextField translateTheWordtf= new TextField();

        BorderPane layout = new BorderPane();
        HBox buttons = new HBox();
        buttons.getChildren().addAll(newWord,practice);

        VBox content = new VBox();
        content.getChildren().addAll(word,wordtf,translation,translationtf);

        layout.setTop(buttons);
        layout.setCenter(content);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }
}
