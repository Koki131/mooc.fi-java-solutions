package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class GreeterApplication extends Application {

    
    @Override
    public void start(Stage window) {
        
        GridPane layout = new GridPane();
        TextField text = new TextField();
        Button button = new Button("Start");
        Label label = new Label("Enter your name and start.");
        layout.add(label, 1, 1);
        layout.add(text, 1, 2);
        layout.add(button, 1, 3);
        layout.setVgap(10);        
        layout.setAlignment(Pos.CENTER);
        
        GridPane second = new GridPane();
        Label sec = new Label("");
        sec.setText(text.getText());
        second.add(sec, 0, 0);
        second.setAlignment(Pos.CENTER);
        Scene secondScene = new Scene(second, 300, 300);
        
        button.setOnAction((event) -> {
            
            window.setScene(secondScene);
            sec.setText("Welcome " + text.getText() + "!");
        });
        
               
        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
        
    }
}
