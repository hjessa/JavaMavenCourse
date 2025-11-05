package Part8;

import java.util.Scanner;

public class ToDoListUI {

    private Scanner scanner;
    private ToDoList list;

    public ToDoListUI(Scanner scanner, ToDoList list){
        this.scanner = scanner;
        this.list = list;
    }

    public void start(){

        while(true){
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if(input.equals("stop")){
                break;
            }

            if(input.equals("add")){
                System.out.print("To add: ");
                input = this.scanner.nextLine();
                this.list.add(input);
                continue;
            }

            if(input.equals("list")){
                list.print();
            }

            if(input.equals("remove")){
                System.out.print("Which one is removed? ");
                int index = 0;
                index = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(index);
            }
        }
    }
}
