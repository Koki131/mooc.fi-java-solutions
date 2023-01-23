package title;

import java.util.*;
import javafx.application.Application.Parameters;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class UserTitle extends Application {

    @Override
    public void start(Stage window) {
        Scanner scanner = new Scanner(System.in);
        Parameters param = getParameters();
        System.out.print("Title: ");
        String title = param.getNamed().get(scanner.nextLine());
        
        window.setTitle(title);
        window.show();
        
    }
}
