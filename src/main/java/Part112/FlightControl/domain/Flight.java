package Part112.FlightControl.domain;

import java.text.MessageFormat;

public class Flight {

    private Airplane airplane;
    private String departureID;
    private String targetID;

    public Flight(Airplane airplane, String depID, String targetID){
        this.airplane = airplane;
        this.departureID = depID;
        this.targetID = targetID;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String getDepartureID() {
        return departureID;
    }

    public String getTargetID() {
        return targetID;
    }


    @Override
    public String toString() {
        return MessageFormat.format("{0} ({1} capacity) ({2}-{3})",this.airplane.getAirplaneId(), this.airplane.getCapacity(),this.departureID, this.targetID);
    }
}
