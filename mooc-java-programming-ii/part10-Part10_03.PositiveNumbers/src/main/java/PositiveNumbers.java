import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>();
list.add(-1);
list.add(7);
list.add(-4);
list.add(2);
list.add(6);
System.out.println(positive(list));
        
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> list = numbers.stream().filter(s -> s > 0).collect(Collectors.toList()); // toList
        List<Integer> list2 = numbers.stream().filter(s -> s > 0).collect(Collectors.toCollection(ArrayList::new)); // toCollection
        return list;
    }

}
