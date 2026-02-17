package Part112.FlightControl.domain;

public class Airplane {

    private String airplaneId;
    private int capacity;

    public Airplane(String Id, int cap){
        this.airplaneId = Id;
        this.capacity = cap;
    }

    public String getAirplaneId() {
        return airplaneId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setAirplaneId(String airplaneId) {
        this.airplaneId = airplaneId;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
