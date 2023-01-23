
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Book)) {
            return false;
        }
        
        Book comparedTo = (Book) compared;
        if (this.name.equals(comparedTo.name) &&
            this.publicationYear == comparedTo.publicationYear) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.publicationYear;
    }

}
