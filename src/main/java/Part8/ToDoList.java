package Part8;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> items;

    public ToDoList(){
        this.items = new ArrayList<>();
    }

    public void add(String task){
        this.items.add(task);
    }

    public void print(){
        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i);
            int num = i+1;

            String message = MessageFormat.format("{0}: {1}",num,item);
            System.out.println(message);
        }
    }

    public void remove(int number){
        int index = number -1;
        items.remove(index);
    }

    public static void main(String[] args){

        ToDoList list = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        ToDoListUI ui = new ToDoListUI(scanner, list);
        ui.start();
    }

}
