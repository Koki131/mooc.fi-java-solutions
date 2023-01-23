package myFirstApplication;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class MyFirstApplication extends Application {
    
    

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        window.setTitle("My first application");
        window.show();
        
    }
    


}
