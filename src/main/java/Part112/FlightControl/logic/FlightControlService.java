package Part112.FlightControl.logic;

import Part112.FlightControl.domain.Airplane;
import Part112.FlightControl.domain.Flight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightControlService {

    private List<Flight> flights;
    private Map<String, Airplane> airplanes;

    public FlightControlService(){
        this.airplanes = new HashMap<>();
        this.flights = new ArrayList<>();
    }

    public void addAirplane(String id, Airplane airplane){
        airplanes.putIfAbsent(id,airplane);
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

//    public List<Flight> getFlights() {
//        return flights;
//    }
//
//    public Map<String, Airplane> getAirplanes() {
//        return airplanes;
//    }

    public Airplane getAirplane(String id){
        return this.airplanes.getOrDefault(id, null);
    }



    public void printAirplanes(){
        this.airplanes.forEach((airplaneID,airplane) -> System.out.println(airplane));
    }

    public void printFlights(){
        this.flights.forEach(System.out::println);
    }
}
