package Part112;

import Part112.FlightControl.domain.Flight;
import Part112.FlightControl.logic.FlightControlService;
import Part112.FlightControl.ui.FlightControlUI;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        UserInterface ui = new TextInterface();
//        new ApplicationLogic(ui).execute(3);
        Scanner scanner = new Scanner(System.in);
        FlightControlUI ui = new FlightControlUI(scanner);
        FlightControlService fcs = new FlightControlService();
        ui.airportAssetControl(fcs);
        System.out.println("###############################################################");
        ui.flightControl(fcs);
    }
}
