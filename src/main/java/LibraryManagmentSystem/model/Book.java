package LibraryManagmentSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Book {
    @Id
    private int bookid;
    private String bookname;
    private String title;
    private boolean available;
    public Book() {
    }

    public Book(int bookid,String bookname, String title,boolean available) {
        this.bookid = bookid;
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
