package Part112.FlightControl.ui;

import java.util.Scanner;

public class FlightControlUI {

    private Scanner scanner;

    public FlightControlUI(Scanner scanner){
        this.scanner = scanner;
    }

    public void start(){

        String input = "";

        while(true){
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            input = scanner.nextLine();

            if(input.equals("x")){
                break;
            }

            if(input.equals("1")){
                System.out.print("Give the airplane id: ");
                String airplaneId = scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());

            }

            if(input.equals("2")){

            }
        }
    }



}
