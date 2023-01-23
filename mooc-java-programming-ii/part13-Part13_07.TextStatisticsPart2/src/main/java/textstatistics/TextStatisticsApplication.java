package textstatistics;

import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import java.util.*;
import javafx.scene.control.TextField;
    

public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage window) {
       BorderPane pane = new BorderPane();
       
       HBox hbox = new HBox();
       hbox.setSpacing(10);
       
       TextArea area = new TextArea();
       
       Label letters = new Label("Letters: 0");
       Label words = new Label("Words: 0");
       Label longest = new Label("The longest word is:");
       hbox.getChildren().addAll(letters, words, longest);
       
       area.textProperty().addListener((change, oldValue, newValue) -> {
        int characters = newValue.length();
        String[] parts = newValue.split(" ");
        String[] parts1 = newValue.split("\n");
        int word = parts.length;
        int word1 = parts1.length;
        String longer = Arrays.stream(parts).sorted((s1, s2) -> s2.length() - s1.length()).findFirst().get();
        
        letters.setText("Letters: " + characters);
        words.setText("Words: " + word);
        
        longest.setText("The longest word is " + longer);
        
        
    });
       
       
       pane.setBottom(hbox);
       
       
       pane.setCenter(area);
       
       Scene scene = new Scene(pane);
       window.setScene(scene);
       window.show();
       
       
       
        
    }   
}
