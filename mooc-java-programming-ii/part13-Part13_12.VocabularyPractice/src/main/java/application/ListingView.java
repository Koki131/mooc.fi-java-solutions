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
import java.util.*;
/**
 *
 * @author milapetrov
 */
public class ListingView {
    private Dictionary dictionary;
    private List<String> words;
    private String gen;
    
    
    public ListingView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.words = new ArrayList<>();
        this.gen = "";
        
       
    }
    
    public Parent getView() {
        GridPane layout = new GridPane();
        
       
        
        Label words = new Label("List of available words for translation");
        Button generate = new Button("Generate");
        Label generated = new Label("");
        Label translate = new Label("Type a word to translate");
        TextField translated = new TextField();
        Button trans = new Button("Translate");
        Label translation = new Label("");
        
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(10);
        layout.setHgap(10);
        
        layout.add(words, 0, 0);
        layout.add(generate, 0, 2);
        layout.add(generated, 0, 1);
        layout.add(translate, 0, 3);
        layout.add(translated, 0, 4);
        layout.add(trans, 0, 5);
        layout.add(translation, 0, 6);
        
        
        
        for (String word : dictionary.values()) {
            if (!(this.words.contains(word))) {
                this.words.add(word);
            }
            
        }
        for (String word : this.words) {
            if (!this.gen.contains(word)) {
                gen = gen + word + ", ";
                
            }
        }
        
        generate.setOnMouseClicked((event) -> {
            generated.setText(gen);
        });
        
        trans.setOnMouseClicked((event) -> {
            if (this.dictionary.values().contains(translated.getText())) {
                translation.setText(this.dictionary.get(translated.getText()));
                translated.clear();
            } else {
                translation.setText("The word doesn't exist");
                translated.clear();
                return;
            }
           
        });
        
        
        
        
        
        return layout;
        
        
    }
    
    
    
}
