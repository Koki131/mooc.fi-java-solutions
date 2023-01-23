package buttonandtextfield;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
        
    }
    
    @Override
    public void start(Stage window) {
        Button button = new Button("I am a button");
        TextField text = new TextField();
        
        FlowPane pane = new FlowPane();
        pane.getChildren().add(button);
        pane.getChildren().add(text);
        
        
        Scene scene = new Scene(pane, 300, 300);
        window.setScene(scene);
        window.show();
    }

}
