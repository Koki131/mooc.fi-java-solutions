import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));
        String[] stringArray = {"Mark", "Julie", "Jordan", "Amelie", "Celine", "Bob"};
        sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(1);
        integers.add(16);
        integers.add(13);
        integers.add(22);
        sortIntegers(integers);
        System.out.println(integers);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Louisiana");
        strings.add("New York");
        strings.add("Washington");
        strings.add("Tokyo");
        strings.add("Amsterdam");
        sortStrings(strings);
        System.out.println(strings);
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
