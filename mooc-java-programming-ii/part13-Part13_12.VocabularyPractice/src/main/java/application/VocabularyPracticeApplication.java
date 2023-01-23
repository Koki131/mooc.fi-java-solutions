package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    private Dictionary dictionary;

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void init() {
        this.dictionary = new Dictionary();
    }
    
    @Override
    public void start(Stage window) {
        ListingView listingView = new ListingView(dictionary);
        PracticeView practiceView = new PracticeView(dictionary);
        InputView inputView = new InputView(dictionary);
        
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        
        Button enterButton = new Button("Enter the words");
        Button practiceButton = new Button("Practice");
        Button listingButton = new Button("Generate words");
        
        menu.getChildren().addAll(enterButton, practiceButton, listingButton);
        layout.setTop(menu);
        
        enterButton.setOnAction((event) -> layout.setCenter(inputView.getView()));
        practiceButton.setOnAction((event) -> layout.setCenter(practiceView.getView()));
        listingButton.setOnAction((event) -> layout.setCenter(listingView.getView()));
        
        layout.setCenter(inputView.getView());
        
        Scene scene = new Scene(layout, 800, 600);
        window.setTitle("Dictionary");
        window.setScene(scene);
        window.show();
    }
}
