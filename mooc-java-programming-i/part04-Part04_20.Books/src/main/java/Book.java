/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milapetrov
 */
public class Book {
    private String name;
    private int pages;
    private int year;
    
    public Book(String bookName, int noPages, int pubYear) {
        this.name = bookName;
        this.pages = noPages;
        this.year = pubYear;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages" + ", " + this.year;
    }
}
