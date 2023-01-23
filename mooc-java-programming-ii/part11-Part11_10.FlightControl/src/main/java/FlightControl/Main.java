package FlightControl;
import FlightControl.domain.Airplane;
import FlightControl.domain.Place;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        TextUI UI = new TextUI(flightControl, scanner);
        UI.start();
        
    }
}
