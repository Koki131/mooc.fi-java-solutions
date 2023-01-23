package asteroids;

import javafx.application.Application;
import javafx.animation.AnimationTimer;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.input.KeyCode;
import javafx.geometry.Point2D;
import java.util.*;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;
import javafx.scene.text.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.application.Platform;
import java.io.IOException;



public class AsteroidsApplication extends Application {
    final private Map<KeyCode, Boolean> pressedKeys;
    final private List<Projectile> projectiles;
    final private List<Asteroid> asteroids;
    public static int WIDTH = 600;
    public static int HEIGHT = 400;
    private boolean timeout;
    private Timer timeoutTask;
    
    public AsteroidsApplication() {
        this.pressedKeys = new HashMap<>();
        this.projectiles = new ArrayList<>();
        this.asteroids = new ArrayList<>();
        this.timeoutTask = new Timer();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage window) {
        Pane pane = new Pane();
        
        BorderPane over = new BorderPane();
        
        over.setPrefSize(WIDTH, HEIGHT);
        pane.setPrefSize(WIDTH, HEIGHT);
        
        
        
        
        // creating a points system
        Text text = new Text(10, 20, "Points: 0");
        pane.getChildren().add(text);
        
        AtomicInteger points = new AtomicInteger();
        
        // creating a game over screen       
        VBox box = new VBox();
        Label label = new Label("GAME OVER!");
        label.setFont(new Font("Monospaced", 40));
        Label pts = new Label("Score: 0");
        pts.setFont(new Font("Arial", 20));
        Button restart = new Button("Restart");
        box.setSpacing(10);
        box.getChildren().addAll(label, pts, restart);
        box.setAlignment(Pos.CENTER);
        
        over.setCenter(box);
        
        
        // creating the ship
        Ship ship = new Ship(WIDTH / 2, HEIGHT / 2);
        
        // creating asteroids
        for (int n = 0; n < 5; n++) {
            Random rand = new Random();
            Asteroid asteroid = new Asteroid(rand.nextInt(WIDTH), rand.nextInt(HEIGHT));
            asteroids.add(asteroid);
        }
        
         
        // adding the ship and asteroids to the view
        pane.getChildren().add(ship.getCharacter());
        asteroids.stream().forEach(asteroid -> pane.getChildren().add(asteroid.getCharacter()));
        
        // creating the scenes
        Scene scene = new Scene(pane);
        Scene gameOver = new Scene(over);
        
        // mapping the pressed keys
        scene.setOnKeyPressed((event) -> {
           pressedKeys.put(event.getCode(), Boolean.TRUE);
        });
        
        scene.setOnKeyReleased((event) -> {
           pressedKeys.put(event.getCode(), Boolean.FALSE);
        });
        
        // creating the movement
        new AnimationTimer() {
            
            @Override
            public void handle(long now) {
                // rotation of the ship
                if (pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
                    ship.turnLeft();
                }
                if (pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
                    ship.turnRight();
                }
                if (pressedKeys.getOrDefault(KeyCode.UP, false)) {
                    ship.accelerate();
                }
                if (pressedKeys.getOrDefault(KeyCode.DOWN, false)) {
                    ship.deccelerate();
                }
                
                // firing projectiles
                if (pressedKeys.getOrDefault(KeyCode.SPACE, false) && projectiles.size() < 3 && !timeout) {
                    timeout = true;
                    
                    Projectile projectile = new Projectile((int) ship.getCharacter().getTranslateX(), (int) ship.getCharacter().getTranslateY());
                    projectile.getCharacter().setRotate(ship.getCharacter().getRotate());
                    projectiles.add(projectile);

                    projectile.accelerate();
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));

                    pane.getChildren().add(projectile.getCharacter());
                }
                
                // moving the asteroids
                asteroids.stream().forEach(asteroid -> asteroid.move());
                
                // moving the projectiles
                projectiles.stream().forEach(projectile -> projectile.move());
                
                ship.move();
                
                // changing to the game over scene when collision happens
                asteroids.stream().forEach(asteroid -> {
                   if (ship.collide(asteroid)) {
                       stop();
                       window.setScene(gameOver);
                   } 
                   
                });
                
                // RESTARTING THE GAME                
                restart.setOnAction((event) -> {
                          window.close();
                          Platform.runLater(() -> new AsteroidsApplication().start(new Stage()));
                          window.setScene(scene);                                                  
                });
                
                
                // FIRST WAY OF REMOVING ASTEROIDS AND PROJECTILES AFTER COLLISION
                
                // List<Projectile> projectilesToRemove = projectiles.stream().filter(projectile -> {
                   // List<Asteroid> collisions = asteroids.stream().filter(asteroid -> asteroid.collide(projectile)).collect(Collectors.toList()); 
                   
                   // if (collisions.isEmpty()) {
                      // return false;
                  // }
                   
                   // collisions.stream().forEach(collided -> {
                      // asteroids.remove(collided);
                      // pane.getChildren().remove(collided.getCharacter());
                   // });
                   
                  // return true;
               // }).collect(Collectors.toList());
                
               // projectilesToRemove.stream().forEach(projectile -> {
                  // pane.getChildren().remove(projectile.getCharacter());
                  // projectiles.remove(projectile);
               // });
               
               
                // SECOND WAY OF REMOVING ASTEROIDS AND PROJECTILES AFTER COLLISION
               
                projectiles.stream().forEach(projectile -> {
                   asteroids.stream().forEach(asteroid -> {
                      if (projectile.collide(asteroid)) {
                          projectile.setAlive(false);
                          asteroid.setAlive(false);
                      } 
                   }); 
                   
                   if (!projectile.isAlive()) {
                       text.setText("Points: " + points.addAndGet(100));
                       pts.setText("Score: " + points);
                   }
                });
                
                projectiles.stream().filter(asteroid -> !asteroid.isAlive()).forEach(asteroid -> pane.getChildren().remove(asteroid.getCharacter()));
                projectiles.removeAll(projectiles.stream().filter(projectile -> !projectile.isAlive()).collect(Collectors.toList()));
                asteroids.stream().filter(asteroid -> !asteroid.isAlive()).forEach(asteroid -> pane.getChildren().remove(asteroid.getCharacter()));
                asteroids.removeAll(asteroids.stream().filter(asteroid -> !asteroid.isAlive()).collect(Collectors.toList()));
                
                if (Math.random() < 0.005) {
                    Asteroid asteroid = new Asteroid(WIDTH, HEIGHT);
                    if (!asteroid.collide(ship)) {
                        asteroids.add(asteroid);
                        pane.getChildren().add(asteroid.getCharacter());
                    }
                }
            }
        }.start();
        
        
        
        window.setTitle("Asteroids!");
        window.setScene(scene);
        window.show();
    }

    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }
    
    class TimeoutTimerTask extends TimerTask {
        public void run() {
            timeout = false;
        }
    }

}
