package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        
        
        Application.launch(args);
    }
    
    @Override
    public void start(Stage window) {
       BorderPane pane = new BorderPane();
       Label text = new Label("First view!");
       Button button = new Button("To the second view!");
       pane.setCenter(button);
       pane.setTop(text);
        
       
       VBox box = new VBox();
       Button vButton = new Button("To the third view!");
       Label second = new Label("Second view!");
       box.getChildren().addAll(vButton, second);
       
       
       GridPane grid = new GridPane();
       Label gridText = new Label("Third view!");
       Button gridButton = new Button("To the first view!");
       grid.add(gridText, 0, 0);
       grid.add(gridButton, 1, 1);
       
        
       Scene scene1 = new Scene(pane);
       Scene scene2 = new Scene(box);
       Scene scene3 = new Scene(grid);
       
       
       button.setOnAction((event) -> {
           window.setScene(scene2);
       });
       
       vButton.setOnAction((event) -> {
           window.setScene(scene3);
       });
       
       gridButton.setOnAction((event) -> {
           window.setScene(scene1);
       });
       
       
       
       window.setScene(scene1);
       window.show();
    }

}
