package ticTacToe;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.geometry.Insets;

public class TicTacToeApplication extends Application {
    private String[][] buttons;

    public static void main(String[] args) {
        Application.launch(args);
             
    }
    
    public TicTacToeApplication() {
        this.buttons = new String[3][3];
    }
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        Label text = new Label("Turn: X");
        text.setFont(Font.font("Monospaced", 30));
                
        layout.setTop(text);
                  
        GridPane menu = new GridPane();
        
        for (int n = 0; n < 3; n++) {           
            for (int i = 0; i < 3; i++) {
                Button button = new Button(" ");
                button.setFont(Font.font("Monospaced", 40));
                menu.add(button, n, i);
                               
                button.setOnAction((event) -> {
                        
                        if (button.getText().equals(" ") && text.getText().contains("X") && !(text.getText().equals("The end!"))) {
                            button.setText("X");                           
                            text.setText("Turn: O");                            
                            buttons[GridPane.getRowIndex(button)][GridPane.getColumnIndex(button)] =  button.getText();                            
                        } 
                        
                        if (button.getText().equals(" ") && text.getText().contains("O") && !(text.getText().equals("The end!"))) {
                            button.setText("O");
                            text.setText("Turn: X");
                            buttons[GridPane.getRowIndex(button)][GridPane.getColumnIndex(button)] =  button.getText();                            
                        } 
                        
                        if (checkHorizontal() == true || checkVertical() == true || checkDiagonal() == true) {
                            text.setText("The end!");                           
                        } 
                         
                    });                 
            }
        }
                       
        menu.setAlignment(Pos.CENTER);
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setVgap(10);
        menu.setHgap(10);
        
        layout.setCenter(menu);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();        
    }
        
    public boolean checkHorizontal() {
        for (int x = 0; x < 3; x++) {                                
            int horizontalX = 0;
            int horizontalO = 0;                                
            for (int y = 0; y < 3; y++) {
                                
                if ( buttons[x][y] == null) {
                    continue;
                }                           
                            
                if (buttons[x][y].equals("X")) {
                    horizontalX++;
                } else if (buttons[x][y].equals("O")) {
                    horizontalO++;
                }                            
            }
            if (horizontalX == 3 || horizontalO == 3) {
                return true;
            }                                
        }
        return false;
    }
    
    public boolean checkVertical() {
        for (int x = 0; x < 3; x++) {                            
            int verticalX = 0;
            int verticalO = 0;
            for (int y = 0; y < 3; y++) {
                if (buttons[y][x] == null) {
                    continue;
                }
                if (buttons[y][x].equals("X")) {
                    verticalX++;
                } else if (buttons[y][x].equals("O")) {
                    verticalO++;
                }
            }
            if (verticalX == 3 || verticalO == 3) {
                return true;
            }                          
        }
        return false;
    }
    
    public boolean checkDiagonal() {
        int diagonalX = 0;
        int diagonalO = 0;
        int diagonalXO = 0;
        int diagonalOO = 0;
        
        // checking diagonally from [0][0]
        for (int x = 0; x < 3; x++) {
            
            if (buttons[x][x] == null) {
                continue;
            }                              
            if (buttons[x][x].equals("X")) {
                diagonalX++;                               
            }
            if (buttons[x][x].equals("O")) {
                diagonalO++;
            }
        }
        if (diagonalX == 3 || diagonalO == 3) {
            return true;
                            
        } 
                
        // checking diagonally from [last][0]
        for (int x = 0; x < 3; x++) {
                            
            if (buttons[2-x][x] == null) {
                continue;
            }
            if (buttons[2-x][x].equals("X")) {
                diagonalXO++;
            } else if (buttons[2-x][x].equals("O")) {
                diagonalOO++;
            }
        }
        
        return diagonalXO == 3 || diagonalOO == 3;
    }

}
