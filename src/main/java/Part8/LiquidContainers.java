package Part8;

import Part7.LargePrograms.LiquidContainer;

import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    private ArrayList<Container> containers;

    public LiquidContainers(){
        containers = new ArrayList<>();
        containers.add(new Container());
        containers.add(new Container());
    }

    public static void main(String[] args){

        LiquidContainers containers = new LiquidContainers();
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println(containers.get(0));
            System.out.println(containers.get(1));

            Container first = containers.get(0);
            Container second = containers.get(1);

            String input = scanner.nextLine();

            if(input.equals("quit")){
                break;
            }

            String[] inputs = input.split(" ");
            String command = inputs[0];
            int value = Integer.valueOf(inputs[1]);


            if(command.equals("add")){
                first.setLiquid(value);
            }
            if(command.equals("move")){
                first.moveLiquid(value,second);
            }
            if(command.equals("remove")){
                second.remove(value);
            }
        }
    }

    public Container get(int index){
        return this.containers.get(index);
    }


}
