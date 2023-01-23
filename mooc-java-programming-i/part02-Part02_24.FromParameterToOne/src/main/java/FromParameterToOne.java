

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(10);
        
    }
    
    public static void printFromNumberToOne(int number) {
        int n = number;
        while (1 <= n) {
            System.out.println(n);
            n--;
        }
    }

}
