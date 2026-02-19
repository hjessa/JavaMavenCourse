package Part112.FlightControl.domain;

import java.util.ArrayList;

public class FlightInformation {

    ArrayList<Flight> flights;

    public FlightInformation(){
        this.flights = new ArrayList<>();
    }

    public void add(Flight flight){
        this.flights.add(flight);
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

}
