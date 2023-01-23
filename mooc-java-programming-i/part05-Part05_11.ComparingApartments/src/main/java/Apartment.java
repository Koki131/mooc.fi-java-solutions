
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    
    public boolean largerThan(Apartment compared) {
        if (this.rooms < compared.rooms) {
            return false;
        }
        if (this.rooms > compared.rooms) {
            return true;
        }
        if (this.squares < compared.squares) {
            return false;
        }
        return true;
            
    }
    
    public int priceDifference(Apartment compared) {
        int first = this.pricePerSquare * this.squares;
        int second = compared.pricePerSquare * compared.squares;
        if (first < second) {
            return second - first;
        }
        return first - second;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int first = this.pricePerSquare * this.squares;
        int second = compared.pricePerSquare * compared.squares;
        if (first < second) {
            return false;
        }
        return true;
    }

}
