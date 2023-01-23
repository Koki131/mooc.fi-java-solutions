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

import java.util.Random;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
    
    @Override
    public void start(Stage window) {
       BorderPane pane = new BorderPane();
       
       HBox hbox = new HBox();
       hbox.setSpacing(10);
       hbox.getChildren().add(new Label("Letters: 0"));
       hbox.getChildren().add(new Label("Words: 0"));
       hbox.getChildren().add(new Label("The longest word is:"));
       
       
       pane.setBottom(hbox);
       
       
       pane.setCenter(new TextArea());
       
       Scene scene = new Scene(pane);
       window.setScene(scene);
       window.show();
       
       
       
        
    }

}
