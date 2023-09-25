package PractWork_2.task7;

public class BookTest {
    public static void main(String[] args) {
        BookShelf bookShelf_obj = new BookShelf();

        bookShelf_obj.addBook("Test2", "QWE", 2004, 666);
        bookShelf_obj.addBook("Test4", "123", 2012, 111);
        bookShelf_obj.addBook("Test3", "ASD", 2006, 777);
        bookShelf_obj.addBook("Test1", "ZXC", 2000, 333);

        bookShelf_obj.ShowBooks();
        bookShelf_obj.sortBooksByDate();
        bookShelf_obj.ShowBooks();
        //System.out.println(bookShelf_obj.getEarliestDateBook());
    }
}
