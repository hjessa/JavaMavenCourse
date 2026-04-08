package Part135.Translator;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class PracticeView {

    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary){
        this.dictionary = dictionary;
    }

    public Parent getView(){

        this.word = dictionary.getRandomWord();
        Button check = new Button("Check translation");
        Label translateTheWord = new Label("Translate the word"+" "+this.word);
        TextField translateTheWordtf= new TextField();
        Label answer = new Label();

        VBox layout = new VBox();
        layout.getChildren().addAll(translateTheWord,translateTheWordtf,check,answer);

        check.setOnMouseClicked((event) -> {

            String translation = translateTheWordtf.getText();
            if(this.dictionary.getTranslation(this.word).equals(translation)){
                answer.setText("Correct!");

            }else{
                answer.setText("Not correct, the translation is "+this.dictionary.getTranslation(this.word));
            }
            this.word = dictionary.getRandomWord();
            translateTheWord.setText("Translate the word"+" "+this.word);
            translateTheWordtf.clear();

        });

        return layout;
    }
}
