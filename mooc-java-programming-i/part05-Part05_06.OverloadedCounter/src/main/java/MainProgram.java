
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(10);
        Counter counter1 = new Counter();
        System.out.println(counter);
        System.out.println(counter1);
        counter1.increase();
        System.out.println(counter1);
        counter1.increase(15);
        System.out.println(counter1);
        counter1.decrease();
        System.out.println(counter1);
        counter1.decrease(-10);
        System.out.println(counter1);
        counter1.decrease(16);
        System.out.println(counter1);
        counter1.increase(16);
        System.out.println(counter1);
        counter.decrease();
        counter.decrease();
        counter.decrease();
        counter.decrease();
        System.out.println(counter);
        counter.decrease(10);
        System.out.println(counter);
        
        
    }
}
