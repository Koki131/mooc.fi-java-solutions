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

public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList() {
        this.tasks = new ArrayList<>();
    }
    
    public void add(String task) {
        this.tasks.add(task);
    }
    
    public void print() {
        for (int n = 0; n < tasks.size(); n++) {
            System.out.println(n+1 + ": " + tasks.get(n));
        }
    }
    
    public void remove(int number) {
        this.tasks.remove(number-1);
    }
}
