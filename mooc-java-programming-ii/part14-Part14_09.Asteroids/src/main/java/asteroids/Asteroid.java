/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;
import javafx.scene.shape.Polygon;
import javafx.geometry.Point2D;
import java.util.*;
/**
 *
 * @author milapetrov
 */
public class Asteroid extends Character {
    
    private double rotation;
    
    
    public Asteroid(int x, int y) {
        super(new PolygonFactory().createPolygon(), x, y);
        
        Random rand = new Random();
        
        super.getCharacter().setRotate(rand.nextInt(360));
        
        int acceleration = 1 + rand.nextInt(10);
        for (int n = 0; n < acceleration; n++) {
            accelerate();
        }
        
        this.rotation = 0.5 - rand.nextDouble();
    }
    
    @Override
    public void move() {
        super.move();
        super.getCharacter().setRotate(super.getCharacter().getRotate() + rotation);
    }
    
    
}
