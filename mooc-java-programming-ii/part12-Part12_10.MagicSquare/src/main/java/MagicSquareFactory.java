
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        
        
        int iterator = 1;
        int len = size * size / 2;
        
        for (int n = 0; n < size; n++) {
            for (int i = 0; i < size; i++) {
                square.placeValue((i - n + len) % size, (n * 2 - i + size) % size, iterator++);
                
                
            }
        }

        // implement the creation of a magic square with the Siamese method algorithm here
        return square;
    }

}
