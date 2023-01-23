package notifier;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;



public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        TextField field = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        button.setOnAction((event) -> {label.setText(field.getText());});
        
        VBox box = new VBox();
        box.getChildren().addAll(field, button, label);
        
        Scene scene = new Scene(box, 100, 100);
        window.setScene(scene);
        window.show();
    }

}
