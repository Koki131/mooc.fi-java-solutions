import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        
        // You can test your method here
Set<String> names = new HashSet<>();
names.add("first");
names.add("first");
names.add("second");
names.add("second");
names.add("second");
print(names);

System.out.println(returnSize(names));
    }
    public static int returnSize(Set<String> names) {
        
        return names.size();
    }
    
    public static void print(Set<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.

}
