
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        String printOutput = "The collection " + this.name + " has " + this.elements.size() + " elements:";
        String printOutputSingle = "The collection " + this.name + " has " + this.elements.size() + " element:\n";
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        String store = "";
        for (String element : this.elements) {
            store = store + element + "\n";
        }
        if (this.elements.size() == 1) {
            return printOutputSingle + this.elements.get(0);
        }
        return printOutput + "\n" + store;
      
  }
}
