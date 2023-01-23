
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift gift = new Gift("Harry potter and the sorcerer's stone", 1);
        Package pkg = new Package();
        pkg.addGift(gift);
        System.out.println(pkg.totalWeight());
    }
}
