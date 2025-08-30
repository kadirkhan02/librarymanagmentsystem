package LibraryManagmentSystem.service;

import LibraryManagmentSystem.model.Book;
import LibraryManagmentSystem.repo.Bookrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class librarianS {

    @Autowired
    Book book;

    @Autowired
    Bookrepo bookrepo;
    List<Book> l=new ArrayList<>();


    public void addBook(Book book) {

        bookrepo.save(book);
    }

    public List<Book> getAllBook() {

        return bookrepo.findAll();
    }


    public void deleteBook(Book book) {
       bookrepo.delete(book);
    }

    public void updateBook(Book book) {
        bookrepo.save(book);
    }

    public Book searchbyId(int bookId) {
        return bookrepo.getReferenceById(bookId);
    }
}
