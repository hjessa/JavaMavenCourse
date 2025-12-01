package Part9;

import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changeLog;

    public ChangeHistory(){
        this.changeLog = new ArrayList<>();
    }

    public void add(double status){
        this.changeLog.add(status);
    }

    public void clear(){
        this.changeLog = new ArrayList<>();
    }

    public String toString(){
        return this.changeLog.toString();
    }

    public double maxValue(){
        if(this.changeLog.isEmpty()){
            return -1;
        }
        double max = 0;

        for (Double v : changeLog) {
            if(v > max){
                max =v;
            }
        }
        return max;
    }

    public double minValue(){
        if(this.changeLog.isEmpty()){
            return -1;
        }
        double min = 0;

        for (Double v : changeLog) {
            if(v < min){
                min =v;
            }
        }
        return min;
    }

    public double average(){
        if(this.changeLog.isEmpty()){
            return 0;
        }

        int counter = 0;
        double sum = 0;

        for (Double v : changeLog) {
            counter++;
            sum += v;
        }

        return sum/counter;
    }


}
