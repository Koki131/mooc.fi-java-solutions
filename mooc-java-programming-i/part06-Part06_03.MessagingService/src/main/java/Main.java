
public class Main {

    public static void main(String[] args) {
        Message mes = new Message("Mike", "Fuck your ass bitch");
        Message mes1 = new Message("Jake", "Suck my Asian dick");
        MessagingService service = new MessagingService();
        service.add(mes1);
        service.add(mes);
        System.out.println(service.getMessages());
       
        // Try out your class here
    }
}
