
public class SimpleDate {

    private int day;
    private int month;
    private int year;
    
    public SimpleDate() {
        this(0, 0, 0);
    }

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance() {
        this.day = this.day + 1;
        if (this.day > 30) {
            this.day = 1;
            this.month = this.month + 1;
            if (this.month > 12) {
                this.month = 1;
                this.year = this.year + 1;
            }
        }
    }
    
    public void advance(int howManyDays) {
        for (int n = 0; n < howManyDays; n++) {
            this.advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        
        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    

}
