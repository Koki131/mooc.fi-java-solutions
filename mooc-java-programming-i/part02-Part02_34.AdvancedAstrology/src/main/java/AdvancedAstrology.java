
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int n = 0; n < number; n++) {
            System.out.print("*");
            
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int n = number; n > 0; n--) {
            System.out.print(" ");
        }
        
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int n = 1; n <= size; n++) {
            printSpaces(size - n);
            printStars(n);   
        }   
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int n = 1;
        while (n <= height) {
            printSpaces(height - n);
            printStars(n + (n - 1));
            n = n + 1;
            if (n > height) {
                for (int y = 0; y < 2; y++) {
                    printSpaces(height + (height - (n + 1)));
                    printStars(3);
                    
                }
            }
            
        }
        
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(1);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(4);
    }
}
