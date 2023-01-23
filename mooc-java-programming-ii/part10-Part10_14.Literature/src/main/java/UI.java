/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milapetrov
 */
import java.io.IOException;
import java.util.*;
import java.util.stream.*;
import java.nio.file.Paths;

public class UI {
    private ArrayList<Library> library;
    private Scanner scanner;
    
    public UI(Scanner scanner) {
        this.scanner = scanner;
        this.library = new ArrayList<>();
    }
    
    public void start() {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            library.add(new Library(name, age));
            System.out.println();
        }
        
        System.out.println();
        System.out.println(library.size() + " books in total.");
        System.out.println();
        System.out.println("Books: ");
        Comparator<Library> comparator = Comparator.comparing(Library::getAge).thenComparing(Library::getName);
        Collections.sort(library, comparator);
        library.stream().forEach(book -> System.out.println(book));
        
        
        
        
    }
}
