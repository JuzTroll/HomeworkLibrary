import java.util.Arrays;
import java.util.Scanner;

public class Library implements AgeRecommendation{
    private Scanner input = new Scanner(System.in);
    private Book[] auxBooks;
    private Book[] books = new Book[200];

    public Book[] getBooks() {
        return this.books;
    }

    private int counter=0;
    private int auxcounter;

    public String readBooks() {
        return input.nextLine();
    }

    public String readUsers() {
        return input.nextLine();
    }

    public void addBook(Book book) {
        this.books[counter] = book;
        this.counter++;
    }

    @Override
    public Book[] sortBooks() {
        this.auxBooks = new Book[counter];
        for(int i=0;i<counter;i++){
            this.auxBooks[i] = this.books[i];
        }
        Arrays.sort(this.auxBooks);
        return this.books;
    }

    @Override
    public Book[] recommendBooksForUser(User user) {
        this.auxBooks = new Book[counter];
        this.auxcounter = this.counter;
        for(int i=0;i<this.auxcounter;i++){
            this.auxBooks[i] = this.books[i];
        }
        for(int i=0;i<this.auxcounter;i++) {
            if((this.auxBooks)[i].getRecommendedAge() > user.getAge()) {
                this.auxBooks[i] = this.books[i+1];
                this.auxcounter--;
            }
        }
        Arrays.sort(this.auxBooks);
        return this.auxBooks;
    }
}
