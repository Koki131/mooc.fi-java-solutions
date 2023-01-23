package borderpane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;



public class BorderPaneApplication extends Application {


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        BorderPane pane = new BorderPane();
        pane.setTop(new Label("NORTH"));
        pane.setRight(new Label("EAST"));
        pane.setBottom(new Label("SOUTH"));
        
        Scene scene = new Scene(pane, 300, 300);
        
        window.setScene(scene);
        window.show();
    }

}
