package PractWork_2.task7;

import java.util.ArrayList;
import java.util.Collections;

public class BookShelf {
    private ArrayList <Book> books = new ArrayList<>();
    private int count_books = 0;

    public void addBook(String author, String title, int date, int pages)
    {
        books.add(new Book(author, title, date, pages));
        count_books++;
    }

    public int getCount_books() {
        return count_books;
    }

    public String getEarliestDateBook()
    {
        int year = 2024;
        Book earliest_book = null;

        for (Book book : books)
        {
            if (book.getDate() < year)
            {
                earliest_book = book;
                year = book.getDate();
            }
        }
        return earliest_book.ToString();
    }

    public String getLastDateBook()
    {
        int year = 0;
        Book last_book = null;

        for (Book book : books)
        {
            if (book.getDate() > year)
            {
                last_book = book;
                year = book.getDate();
            }
        }
        return last_book.ToString();
    }

    public void sortBooksByDate()
    {
        for (int i = 0; i < count_books; i++)
        {
            for (int j = 0; j < count_books - 1; j++)
            {
                if (books.get(j).getDate() > books.get(j + 1).getDate())
                {
                    Collections.swap(books, j, j + 1);
                }
            }
        }
    }

    public void ShowBooks()
    {
        for (int i = 0; i < count_books; i++)
        {
            System.out.println("\n" + (i + 1) + " Книга\n" + books.get(i).ToString());
        }
    }
}