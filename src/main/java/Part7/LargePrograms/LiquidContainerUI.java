package Part7.LargePrograms;

import java.util.Scanner;

public class LiquidContainerUI {

    private Scanner scanner;
    private Container first;
    private Container second;

    public LiquidContainerUI(){
        this.scanner = new Scanner(System.in);
        this.first = new Container();
        this.second = new Container();
    }

    public void start(){
        while(true){
            System.out.println("First: "+this.first);
            System.out.println("Second: "+this.second);
            String input = this.scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(input.equals("quit")){
                break;
            }

            if(command.equals("add")){
                this.first.add(amount);
            }

            if(command.equals("move")){
                this.first.move(amount,this.second);

            }
            if(command.equals("remove")){
                this.second.remove(amount);
            }
        }
    }

}
