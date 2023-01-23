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

public class Employees {
    private List<Person> people;
    
    public Employees() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> people.add(person));
    }
    
    public void print() {
        Iterator<Person> iterator = people.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        // Using streams
        // people.stream().filter(people -> people.getEducation() == education).forEach(print -> System.out.println(print));
        // Using the Iterator class
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person crap = iterator.next();
            if (crap.getEducation() == education) {
                System.out.println(crap);
            }
        }
        
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = people.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
