
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        
        VehicleRegistry registry = new VehicleRegistry();

        registry.add(li1, "Mark");
        registry.add(li2, "Mark");
        registry.add(li3, "Mark");
        registry.add(li3, "Mark");
        
        registry.add( new LicensePlate("FI", "AAA-111"), "Arto");
        registry.add( new LicensePlate("FI", "AAA-111"), "Arto");
        registry.printLicensePlates();
        registry.printOwners();
        
        registry.printLicensePlates();
        // if the hasCode-method hasn't been overwritten, the owners won't be found
        
        
    }
}
