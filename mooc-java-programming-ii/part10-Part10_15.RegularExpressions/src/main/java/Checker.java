import java.util.*;

public class Checker {
        
    public boolean isDayOfWeek(String string) {
        String day = "(mon|tue|wed|thu|fri|sat|sun)";
        return string.matches(day);
    }
    
    public void printDay(String string) {
         if (isDayOfWeek(string) == true) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
    
    public boolean allVowels(String string) {
        String vowels = "[aeiou]*";
        return string.matches(vowels);
    }
    
    public void printVow(String string) {
        if (allVowels(string) == true) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
    
    public boolean timeOfDay(String string) {
        String time = "([0-1][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]";
        return string.matches(time);
    }
    
    public void printTime(String string) {
        if (timeOfDay(string) == true) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
