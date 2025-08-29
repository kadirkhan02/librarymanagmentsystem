package LibraryManagmentSystem.service;

import LibraryManagmentSystem.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class librarianS {

    @Autowired
    Book book;

    List<Book> l=new ArrayList<>();


    public void addBook(Book book) {

        l.add(book);
    }

    public List<Book> getAllBook() {

        return l;
    }


    public void deleteBook(Book book) {
        
    }

    public void updateBook(Book book) {
    }

    public Book searchbyId(int bookId) {
        return null;
    }
}
