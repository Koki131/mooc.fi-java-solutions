/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;
import FlightControl.domain.Airplane;
import FlightControl.domain.Place;
import FlightControl.domain.Flight;
import java.util.*;


/**
 *
 * @author milapetrov
 */
public class FlightControl {
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    
    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirplane(String ID, int capacity) {
        Airplane airplane = new Airplane(ID, capacity);
        this.airplanes.put(ID, airplane);
    }
    
    public void addFlight(Airplane plane, String depID, String destID) {
        this.places.putIfAbsent(depID, new Place(depID));
        this.places.putIfAbsent(destID, new Place(destID));
        
        Flight flight = new Flight(plane, this.places.get(depID), this.places.get(destID));
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }
    
    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
}
