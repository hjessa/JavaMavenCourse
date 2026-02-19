package Part112;

import Part112.FlightControl.domain.Flight;
import Part112.FlightControl.domain.FlightInformation;
import Part112.FlightControl.ui.FlightControlUI;
import Part112.mooc.logic.ApplicationLogic;
import Part112.mooc.ui.UserInterface;
import Part112.mooc.ui.TextInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        UserInterface ui = new TextInterface();
//        new ApplicationLogic(ui).execute(3);
        Scanner scanner = new Scanner(System.in);
        FlightControlUI ui = new FlightControlUI(scanner);
        FlightInformation fi = ui.airportAssetControl();
        ArrayList<Flight> flights = fi.getFlights();
        System.out.println("###############################################################");
        ui.flightControl(flights);
    }
}
