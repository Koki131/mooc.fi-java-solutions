
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Reader> list = new ArrayList<>();
        reader(list);
        // Without the compareTo method
        // Collections.sort(list, (p1, p2) -> { return (int) p1.getPercent() - (int) p2.getPercent();});
        // list.stream().sorted((p1, p2) -> (int) p1.getPercent() - (int) p2.getPercent()).forEach(itm -> System.out.println(itm));
        print(list);
        
        
        
        
        
        
    }
    
    public static void reader(ArrayList<Reader> list) {
        try {
            Files.lines(Paths.get("literacy.csv")).map(itm -> itm.split(",")).filter(parts -> parts.length >= 6).map(parts -> new Reader(parts[0], parts[1], parts[2].trim(), parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5]))).forEach(itm -> list.add(itm));
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    
    public static void print(ArrayList<Reader> list) {
        Collections.sort(list);
        list.stream().forEach(itm -> System.out.println(itm));
        
    }
}
