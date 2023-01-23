
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        Random rand = new Random();
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        
        while (true) {
            int random = rand.nextInt(40 - 1 + 1) + 1;
            if (containsNumber(random) == false) {
                this.numbers.add(random);
            } 
            if (this.numbers.size() == 7) {
                break;
            }
        }
        
        //7 21 38 13 25 24 4
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}

