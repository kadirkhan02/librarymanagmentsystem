package LibraryManagmentSystem.DTO;

import lombok.*;


public class BookResponse {
    private String bookname;
    private String title;
    private boolean available;

    public BookResponse() {
    }

    public BookResponse(String bookname, String title, boolean available) {
        this.bookname = bookname;
        this.title = title;
        this.available = available;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
