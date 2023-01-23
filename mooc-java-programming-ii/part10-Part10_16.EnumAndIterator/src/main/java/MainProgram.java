
public class MainProgram {

    public static void main(String[] args) {
        Employees university = new Employees();
university.add(new Person("Petrus", Education.PHD));
university.add(new Person("Arto", Education.HS));
university.add(new Person("Elina", Education.PHD));
university.add(new Person("Mark", Education.MA));
university.add(new Person("John", Education.BA));
university.add(new Person("Michael", Education.BA));

university.print();
System.out.println();
university.print(Education.PHD);
    }
}
