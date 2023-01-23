

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
    public static void printUntilNumber(int number) {
        int n = 1;
        while (n <= number) {
            System.out.println(n);
            n++;
        }
    }

}
