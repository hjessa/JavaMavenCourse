package Part112.FlightControl.ui;

import Part112.FlightControl.domain.Airplane;
import Part112.FlightControl.domain.Flight;
import Part112.FlightControl.domain.FlightInformation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FlightControlUI {

    private Scanner scanner;

    public FlightControlUI(Scanner scanner){
        this.scanner = scanner;
    }

    public void airportAssetControl(){

        String input = "";
        Set<Airplane> airplanes = new HashSet<>();
        FlightInformation fi = new FlightInformation();
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
                airplanes.add(new Airplane(airplaneId,capacity));

            }

            if(input.equals("2")){
                System.out.print("Give the airplane id: ");
                String airplaneId = scanner.nextLine();
                Airplane toAdd = airplanes.stream().filter(a -> a.getAirplaneId().equals(airplaneId)).findFirst().orElse(null);

                    if(toAdd != null) {
                        System.out.print("Give the departure airport id: ");
                        String departureId = scanner.nextLine();
                        System.out.print("Give the target airport id:  ");
                        String targetId = scanner.nextLine();
                        fi.add(new Flight(toAdd,departureId,targetId));
                    }

                } else {continue;}
            }
        }
    }




