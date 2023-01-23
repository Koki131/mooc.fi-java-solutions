import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
        List<Student> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("akfs");
        list1.add("ksfk");
        list1.add("ghgh");
        list1.add("bwbe");
        list1.add("asdas");
        list1.add("gcgc");
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println();
        
        list.add(first);
        list.add(second);
        list.add(new Student("mark"));
        list.add(new Student("britney"));
        list.add(new Student("amarai"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
