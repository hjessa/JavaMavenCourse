package Part113.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{

    public ArrayList<Sensor> sensors;

    public ArrayList<Integer> readings;

    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        if(!this.sensors.isEmpty()){
            for (Sensor sensor : this.sensors) {
                if(!sensor.isOn()){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;

    }

    @Override
    public void setOff() {
        if(!this.sensors.isEmpty()){
            this.sensors.forEach(sensor -> sensor.setOff());
        }

    }

    @Override
    public void setOn() {
        if(!this.sensors.isEmpty()) {
            this.sensors.forEach(sensor -> sensor.setOn());
        }
    }

    @Override
    public int read() {
        if(!this.sensors.isEmpty() && this.isOn()){
            int tempSum = this.sensors.stream()
                    .mapToInt(s -> s.read())
                    .sum();


            int result = tempSum/this.sensors.size();
            this.readings.add(result);
            return result;

        }else {
            throw new IllegalStateException("Lista pusta lub jeden z sensorów wyłączony");
        }
    }

    public void addSensor(Sensor sensor){
        this.sensors.add(sensor);
    }

    public List<Integer> readings(){
        return this.readings;
    }
}
