
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Tesla");
        strings.add("VW");
        strings.add("Audi");
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
    }
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() > 0) {
            strings.remove(strings.size() - 1);
        } else {
            return;
        }
    }

}
