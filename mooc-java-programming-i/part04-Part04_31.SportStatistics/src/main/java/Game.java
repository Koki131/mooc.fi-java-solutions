/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milapetrov
 */
public class Game {
    // create variables
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;
    
    // initiane constructor
    public Game(String homeTeam, String visitingTeam, int homePoints, int visitingPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }
    // getter method for homeTeam
    public String getHome() {
        return this.homeTeam;
    }
    // getter method for visitingTeam
    public String getVisiting() {
        return this.visitingTeam;
    }
    // method for determining the winner
    public boolean isWinner(String team) {
        if (team.equals(this.homeTeam) && this.homePoints > this.visitingPoints) {
            return true;
        }
        if (team.equals(this.visitingTeam) && this.visitingPoints > this.homePoints) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.homeTeam + ", " + this.visitingTeam + ", " + this.homePoints + ", " + this.visitingPoints;
    }
}
