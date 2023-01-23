/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milapetrov
 */
import java.util.*;

public class Statistics {
    private ArrayList<Integer> numbers;
    
    
    public Statistics() {
        this.numbers = new ArrayList<>();      
    }
    
    public void add(int number) {
        this.numbers.add(number);
    }
    
    public double average() {
        int sum = 0;
        int size = this.numbers.size();
        for (Integer number : numbers) {
            sum = sum + number;
        }
        double average = 1.0 * sum / size;
        
        return average;
    }
    
    public void avgOfPassing() {
        int sum = 0;
        int count = 0;
        for (Integer number : numbers) {
            if (number >= 50 && number <= 100) {
                sum = sum + number;
                count = count + 1;
            } 
        }
        double average = 1.0 * sum / count;
        
        if (sum == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + average);
        }
        
    }
    
    public double passPercent() {
        int sum = 0;
        int count = 0;
        int total = 0;
        for (Integer number : numbers) {
            total = total + 1;
            if (number >= 50 && number <= 100) {
                sum = sum + number;
                count = count + 1;
            }
        }
        double passPercent = 1.0 * 100 * count / total;
        return passPercent;
    }
    
    // koki brute forcing beacuse he's a dumbass
    public void addStars() {
        String five = "";
        String four = "";
        String three = "";
        String two = "";
        String one = "";
        String zero = "";
        for (int n = 0; n < numbers.size(); n++) {
            
            if (numbers.get(n) < 50) {
                zero = zero + "*";
            } else if (numbers.get(n) < 60) {
                one = one + "*";
            } else if (numbers.get(n) < 70) {
                two = two + "*";
            } else if (numbers.get(n) < 80) {
                three = three + "*";
            } else if (numbers.get(n) < 90) {
                four = four + "*";
            } else if (numbers.get(n) >= 90) {
                five = five + "*";
            }
        }
        
        System.out.println("5: " + five);
        System.out.println("4: " + four);
        System.out.println("3: " + three);
        System.out.println("2: " + two);
        System.out.println("1: " + one);
        System.out.println("0: " + zero);
        
    }
    
    public int convert(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else if (points >= 90) {
            grade = 5;
        }
        return grade;
    }
    
    public String stars(int amount) {
        String stars = "";
        for (int n = 0; n < amount; n++) {
            stars = stars + "*";
        }
        return stars;
    }
    
    public String print(int grade) {
        int howManyStars = 0;
        for (int n = 0; n < numbers.size(); n++) {
            if (convert(numbers.get(n)) == grade) {
                howManyStars++;
            }
        }
        return stars(howManyStars);
    }
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Point average (all): " + average();
    }
}
