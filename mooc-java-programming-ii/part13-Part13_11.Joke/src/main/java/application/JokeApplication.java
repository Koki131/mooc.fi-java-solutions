package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        
        menu.getChildren().addAll(joke, answer, explanation);
        
        layout.setTop(menu);
        
        StackPane firstView = createView("What do you call a bear with no teeth?");
        StackPane secondView = createView("A gummy bear");
        StackPane thirdView = createView("I can't think of anything smart to say here");
        
        joke.setOnAction((event) -> layout.setCenter(firstView));
        answer.setOnAction((event) -> layout.setCenter(secondView));
        explanation.setOnAction((event) -> layout.setCenter(thirdView));
        
        layout.setCenter(firstView);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
               
    }
    
    public StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }
    
   
    
}
