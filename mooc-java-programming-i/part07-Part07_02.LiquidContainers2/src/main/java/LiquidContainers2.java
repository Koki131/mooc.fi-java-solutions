
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();
        UserInterface UI = new UserInterface(container, scan);
        
        UI.start();
        
        
    }

}
