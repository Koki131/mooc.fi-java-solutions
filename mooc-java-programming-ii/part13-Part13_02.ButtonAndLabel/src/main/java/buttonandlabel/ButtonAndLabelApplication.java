package buttonandlabel;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Group;
import javafx.scene.layout.Pane;

        

public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }
    
    
    @Override
    public void start(Stage window) {
        FlowPane flowpane = new FlowPane();
        Button button = new Button("This is a button");
        Label label = new Label("I have a smol pepe");
        button.setLayoutY(250);
        button.setLayoutX(210);
        
        flowpane.getChildren().add(label);  
        flowpane.getChildren().add(button);
        
        
        
        
        
        
        Scene scene = new Scene(flowpane, 300, 300);
        window.setScene(scene);
        window.show();
    }
}
