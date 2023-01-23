

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Item item = new Item("Dogshit", 182);
        Item item1 = new Item("Crap", 122);
        Item item2 = new Item("Horse", 152);
        Item item3 = new Item("Frog", 132);
        Suitcase suitcase = new Suitcase(500);
        suitcase.addItem(item);
        suitcase.addItem(item1);
        suitcase.addItem(item2);
        suitcase.addItem(item3);
        suitcase.printItems();
        System.out.println(suitcase.totalWeight());
        System.out.println();
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
 
        Suitcase adasCase = new Suitcase(5);
        adasCase.addItem(book);
        adasCase.addItem(phone);
 
        Suitcase pekkasCase = new Suitcase(5);
        pekkasCase.addItem(brick);
 
        Hold hold = new Hold(5);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);
 
        System.out.println("Printing: " + hold);
        System.out.println("Total weight: " + hold.totalWeight());
 
        
    }

}
