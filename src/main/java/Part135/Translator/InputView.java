package Part135.Translator;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class InputView {

    private Dictionary dictionary;

    public InputView(Dictionary dictionary){
        this.dictionary = dictionary;
    }

    public Parent getView(){
        Button add = new Button("Add new pair");
        Label word = new Label("Word");
        Label translation = new Label("Translation");
        TextField wordtf = new TextField();
        TextField translationtf = new TextField();

        VBox layout = new VBox();
        layout.getChildren().addAll(word,wordtf,translation,translationtf,add);

        add.setOnMouseClicked((event)->{
            String wordToAdd = wordtf.getText();
            String translationToAdd = translationtf.getText();

            this.dictionary.addTranslation(wordToAdd,translationToAdd);
            wordtf.clear();
            translationtf.clear();
        });

        return layout;
    }

}
