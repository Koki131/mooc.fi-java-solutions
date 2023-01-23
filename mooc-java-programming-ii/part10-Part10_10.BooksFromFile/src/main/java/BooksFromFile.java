
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        String file = scanner.nextLine();
        System.out.println(readBooks(file));

    }
    
    public static List<Book> readBooks(String file) {
        List<Book> book = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file)).map(bk -> bk.split(",")).filter(parts -> parts.length >= 4).map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3])).forEach(itm -> book.add(itm));
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return book;
    } 

}
