package hurraa;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;
import java.nio.file.*;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane1 = new BorderPane();
        BorderPane pane2 = new BorderPane();
        AudioClip sound = new AudioClip("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3");
        
        Scene scene = new Scene(pane1, 600, 400);
        Scene scene2 = new Scene(pane2, 600, 400);
        
        Button play = new Button("Play");
        Button stop = new Button("Stop");
        pane1.setCenter(play);
        pane2.setCenter(stop);
        
        play.setOnAction((event) -> {           
            stage.setScene(scene2);
            sound.play();           
        });
        
        stop.setOnAction((event) -> {
            stage.setScene(scene);
            sound.stop();
        });

     
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
