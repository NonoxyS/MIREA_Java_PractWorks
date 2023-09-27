package PractWork_4.task3;

public class Book {
    private String author, title;
    private int date, pages;

    public Book(String author, String title, int date, int pages)
    {
        this.author = author;
        this.title = title;
        this.date = date;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }

    public int getPages() {
        return pages;
    }

    public String ToString()
    {
        return String.format("Автор: %s" +
                        "\nНазвание: %s" +
                        "\nГод написания: %s" +
                        "\nСтраниц: %d", author, title, date, pages);
    }
}
