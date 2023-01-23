/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author milapetrov
 */
public class Flight {
    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;
    
    public Flight(Airplane airplane, Place departure, Place target) {
        this.airplane = airplane;
        this.departureAirport = departure;
        this.targetAirport = target;
    }
    
    public Airplane getAirplane() {
        return this.airplane;
    }
    
    public Place getTargetPlace() {
        return this.targetAirport;
    }
    
    public Place getDeparturePlace() {
        return this.departureAirport;
    }
    
    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirport + "-" + this.targetAirport + ")";
    }
}
