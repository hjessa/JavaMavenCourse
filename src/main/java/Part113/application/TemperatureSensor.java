package Part113.application;

import java.util.Random;

public class TemperatureSensor implements Sensor{

    private boolean state;
    private Random random;

    public TemperatureSensor(){
        this.state = false;
        this.random = new Random();
    }

    @Override
    public int read() {
        if(this.state){
            return random.nextInt(-30,31);
        }
        else{
            throw new IllegalStateException("Sensor jest wyłączony");
        }
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public boolean isOn() {
        return this.state;
    }
}
