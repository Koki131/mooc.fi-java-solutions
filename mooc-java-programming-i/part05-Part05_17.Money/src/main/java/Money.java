
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int totalE = this.euros + addition.euros;
        int totalC = this.cents + addition.cents;
        Money newMoney = new Money(totalE, totalC);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Money)) {
            return false;
        }
        
        Money comparedTo = (Money) compared;
        
        if (this.euros < comparedTo.euros) {
            return true;
        }
        if (this.euros == comparedTo.euros && this.cents < comparedTo.cents) {
            return true;
        }
        return false;
               
    }
    
    public Money minus(Money decreaser) {
        int newEuro = this.euros - decreaser.euros;
        int newCent = this.cents - decreaser.cents;
        if (newEuro < 0) {
            newEuro = 0;
            newCent = 0;
        }
        if (newEuro > 0 && newCent < 0) {
            newEuro = newEuro - 1;
            newCent = 100 - decreaser.cents;
        }
        
        Money newMoney = new Money(newEuro, newCent);
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
