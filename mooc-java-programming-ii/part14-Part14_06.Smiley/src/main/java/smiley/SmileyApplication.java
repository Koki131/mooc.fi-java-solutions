package smiley;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.*;


public class SmileyApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch(args);
    }
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext painter = canvas.getGraphicsContext2D();
        
        
        layout.setCenter(canvas);       
        painter.setFill(Color.BLACK);
        painter.fillRect(100, 100, 50, 50);
        painter.fillRect(250, 100, 50, 50);
        painter.fillRect(50, 200, 50, 50);
        painter.fillRect(300, 200, 50, 50);
        painter.fillRect(100, 250, 200, 50);
        
        Scene scene = new Scene(layout, 400, 400, Color.WHITE);
        window.setScene(scene);
        window.show();
    }

}
