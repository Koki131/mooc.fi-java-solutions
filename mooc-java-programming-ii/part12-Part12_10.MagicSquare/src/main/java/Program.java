
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        MagicSquare square = new MagicSquare(4);
        
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(3));
    }
}
