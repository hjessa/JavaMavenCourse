package Part113.application;

import java.util.ArrayList;

public class AverageSensor implements Sensor{

    public ArrayList<Sensor> sensors;

    public AverageSensor(){
        this.sensors = new ArrayList<>();

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

            return tempSum/this.sensors.size();

        }else {
            throw new IllegalStateException("Lista pusta lub jeden z sensorów wyłączony");
        }
    }

    public void addSensor(Sensor sensor){
        this.sensors.add(sensor);
    }
}
