
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation childrensHospital = new HealthStation();
        Person ethan = new Person("Ethan", 1, 110, 8);
        Person mark = new Person("Mark", 3, 150, 73);
       
        System.out.println(childrensHospital.weighings());
        System.out.println(childrensHospital.weigh(ethan));
        System.out.println(childrensHospital.weighings());
        
        
    }
}
