
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        int size = Integer.valueOf(scanner.nextLine());
        Cube cube = new Cube(size);
        cube.volume();
        System.out.println(cube.toString());
    
    }   
    
}
