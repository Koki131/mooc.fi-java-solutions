/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milapetrov
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hunSec;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hunSec = new ClockHand(100);
    }
    
    @Override
    public String toString() {
        return this.seconds + ":" + this.hunSec;
    }
    
    public void advance() {
        this.hunSec.advance();
        if (this.hunSec.value() == 0) {
            this.seconds.advance();
        }
        
    }
}
