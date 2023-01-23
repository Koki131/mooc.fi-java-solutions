
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            String[] split = name.split(",");
            
            
            for (int i = 0; i < split.length; i++) {
                if (oldest < Integer.valueOf(split[1])) {
                    oldest = Integer.valueOf(split[1]);
                }
                
            }
           
            
            
        }
        System.out.println("Age of the oldest: " + oldest);
       
        

    }
}
