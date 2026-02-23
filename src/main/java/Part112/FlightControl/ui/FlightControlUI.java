package Part112.FlightControl.ui;

import Part112.FlightControl.domain.Airplane;
import Part112.FlightControl.domain.Flight;
import Part112.FlightControl.logic.FlightControlService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FlightControlUI {

    private Scanner scanner;

    public FlightControlUI(Scanner scanner){
        this.scanner = scanner;
    }

    public void airportAssetControl(FlightControlService fcs){

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
                fcs.addAirplane(airplaneId,new Airplane(airplaneId,capacity));

            }

            if(input.equals("2")){
                System.out.print("Give the airplane id: ");
                String airplaneId = scanner.nextLine();
                Airplane airplane = fcs.getAirplane(airplaneId);
//                Airplane toAdd = airplanes.stream().filter(a -> a.getAirplaneId().equals(airplaneId)).findFirst().orElse(null);

                    if(airplane != null) {
                        System.out.print("Give the departure airport id: ");
                        String departureId = scanner.nextLine();
                        System.out.print("Give the target airport id:  ");
                        String targetId = scanner.nextLine();
                        fcs.addFlight(new Flight(airplane,departureId,targetId));
                    }

                } else {
                System.out.println("Airplane nie istnieje");
                continue;}
            }

    }

    public void flightControl(FlightControlService fcs){

        String input = "";
        while(true){
            System.out.println("Choose an action:");
            System.out.println("[1]  Print airplanes");
            System.out.println("[2]  Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            input = this.scanner.nextLine();
            if(input.equals("x")){break;}

            if(input.equals("1")){
                fcs.printAirplanes();
            }

            if(input.equals("2")){
                fcs.printFlights();
            }

            if(input.equals("3")){
                System.out.print("Give the airplane id: ");
                String airplaneId = this.scanner.nextLine();
                System.out.println(fcs.getAirplane(airplaneId));
            }
        }
    }

}





