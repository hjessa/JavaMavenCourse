package Part8;

import java.util.HashMap;

public class IOU {

    private HashMap<String,Double> iou;

    public IOU(){
        this.iou = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){

        this.iou.put(toWhom,amount);
    }

    public double howMuchDoIOweTo(String toWhom){

            return this.iou.getOrDefault(toWhom,0.0);
    }

    public static void main(String[] args){

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }

}
