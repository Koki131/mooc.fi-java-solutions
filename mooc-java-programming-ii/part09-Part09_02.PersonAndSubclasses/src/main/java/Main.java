import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
        Person ollie = new Student("Ollie", "Dogshit avenue 1924");
        System.out.println(ollie);

        printPersons(persons);
        
    }
    
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
