
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(6);
        numbers.add(-1);
        numbers.add(10);
        numbers.add(13);
        System.out.println(sum(numbers));
        numbers.add(14);
        numbers.add(10);
        System.out.println(sum(numbers));
    }
    public static int sum(ArrayList<Integer> numbers) {
        int total = 0;
        for (int n = 0; n < numbers.size(); n++) {
            total = total + numbers.get(n);
            
        }
        return total;
    }

}
