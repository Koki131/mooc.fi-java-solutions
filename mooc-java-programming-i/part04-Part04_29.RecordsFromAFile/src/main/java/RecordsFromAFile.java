
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String reading = reader.nextLine();
                
                String[] list = reading.split(",");
                String name = list[0];
                int age = Integer.valueOf(list[1]);
                
                if (age == 0) {
                    System.out.println(name + ", " + "age: " + age + " years");
                } else if (age > 1) {
                    System.out.println(name + ", " + "age: " + age + " years");
                } else {
                    System.out.println(name + ", " + "age: " + age + " year");
                }
                
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
