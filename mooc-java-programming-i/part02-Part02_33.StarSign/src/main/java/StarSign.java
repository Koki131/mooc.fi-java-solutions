
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(3);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int n = 0; n < number; n++) {
            System.out.print("*");
            
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        for (int n = 0; n < size; n++) {
            System.out.print("");
            printStars(size);
            
            
        }
        System.out.print("");
        
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for (int n = 0; n < height; n++) {
            System.out.print("");
            printStars(width);
            
        }
        System.out.print("");
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int n = 0; n < size; n++) {
            System.out.print("");
            printStars(n + 1);
            
        }
        System.out.print("");
        
    }
}
