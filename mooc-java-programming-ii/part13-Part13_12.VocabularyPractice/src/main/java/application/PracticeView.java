/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
/**
 *
 * @author milapetrov
 */
public class PracticeView {
    private Dictionary dictionary;
    private String word;
    
    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = this.dictionary.getRandomWord();
    }
    
    public Parent getView() {
        GridPane layout = new GridPane();
        
        Label wordInstructions = new Label("Translate the word '" + this.word + "'");
        TextField translationField = new TextField();
        
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        
        Button addButton = new Button("Check");
        
        Label feedback = new Label("");
        
        layout.add(wordInstructions, 0, 0);
        layout.add(translationField, 0, 1);
        layout.add(addButton, 0, 2);
        layout.add(feedback, 0, 3);
        
        addButton.setOnMouseClicked((event) -> {
            String translation = translationField.getText();
            if (this.dictionary.get(this.word).equals(translation)) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! The correct translation for the word " + this.word + " is " + this.dictionary.get(word) + ".");
                return;
            }
            
            this.word = this.dictionary.getRandomWord();
            wordInstructions.setText("Translate the word '" + this.word + "'");
            translationField.clear();
        });
        
        return layout;
        
    }
}
