
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("First name: ");
            String fName = scanner.nextLine();
            if (fName.equals("")) {
                System.out.println();
                break;
                
            }
            System.out.print("Last name: ");
            String lName = scanner.nextLine();
            System.out.print("Idetification number: ");
            String id = scanner.nextLine();
            infoCollection.add(new PersonalInformation(fName, lName, id));
            
            
            
        }
        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
        
        
        
    }
}
