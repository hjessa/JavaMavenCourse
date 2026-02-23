package Part112.FlightControl.domain;

import java.text.MessageFormat;

public class Airplane {

    private String airplaneId;
    private int capacity;

    public Airplane(String id, int cap){
        this.airplaneId = id;
        this.capacity = cap;
    }

    public String getAirplaneId() {
        return airplaneId;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} ({1} capacity)",this.getAirplaneId(),this.getCapacity());
    }
}
