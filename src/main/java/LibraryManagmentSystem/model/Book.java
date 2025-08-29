package LibraryManagmentSystem.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
    static int count=0;
    private int bookid;
    private String bookname;
    private String title;
    private boolean available;
    public Book() {
    }

    public Book(String bookname, String title,boolean available) {
        this.bookid = ++count;
        this.bookname = bookname;
        this.title = title;
        this.available=available;
    }

    public int getBookid() {
        return bookid;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
