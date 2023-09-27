package PractWork_4.task3;

import PractWork_2.task7.BookShelf;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone",
                1997, 352);

        System.out.println(book.ToString() + "\n");

        book.setAuthor("Stephen King");
        book.setTitle("The Shining");
        book.setDate(1977);
        book.setPages(497);

        System.out.println(book.ToString());
    }
}
