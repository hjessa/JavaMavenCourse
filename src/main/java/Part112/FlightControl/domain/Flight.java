package Part112.FlightControl.domain;

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

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public void setDepartureID(String departureID) {
        this.departureID = departureID;
    }

    public void setTargetID(String targetID) {
        this.targetID = targetID;
    }
}
