
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Random;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        System.out.print("Size: ");
        int size = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            char randChar = (char) (rand.nextInt(26) + 'a');
            books.add(new Book(i, randChar + " "+ i));
        }
        System.out.print("Seach for: ");
        int searchFor = Integer.valueOf(scanner.nextLine());
        linearSearch(books, searchFor);
        binarySearch(books, searchFor);
        System.out.println(books.get(searchFor));
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
       for (int n = 0; n < books.size(); n++) {
           if (books.get(n).getId() == searchedId) {
               return n;
           }
       }
        
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {   
        int begin = 0;
        int end = books.size() - 1;
        while (true) {
            int middle = (begin + end) / 2;
            if (begin > end) {
                break;
            }
            if (books.get(middle).getId() == searchedId) {
                return middle;
            }
            
            if (books.get(middle).getId() < searchedId) {
                begin = middle + 1;
            }
            
            if (books.get(middle).getId() > searchedId) {
                end = middle - 1;
            }
        }
            
        
        
        return -1;
    }
    
}

