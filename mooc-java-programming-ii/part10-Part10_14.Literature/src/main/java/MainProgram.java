
import java.util.Scanner;
import java.io.IOException;
import java.util.*;
import java.util.stream.*;
import java.nio.file.Paths;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UI ui = new UI(scanner);
        ui.start();
    }

}
