package LibraryManagmentSystem.controller;

import LibraryManagmentSystem.model.Book;
import LibraryManagmentSystem.service.librarianS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class librarianC {

    @Autowired
    librarianS service;

    @PostMapping("librarian")
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }
    @GetMapping("librarian")
    public List<Book> getAllBook()
    {
        return service.getAllBook();
    }
    @DeleteMapping("librarian")
    public void deleteBook(@RequestBody Book book)
    {
         service.deleteBook(book);
    }
    @PutMapping("librarian")
    public void updateBook(@RequestBody Book book)
    {
        service.updateBook(book);
    }
    @GetMapping("librarian/{bookId}")
    public Book searchbyId(@PathVariable int bookId)
    {
        return service.searchbyId(bookId);
    }


}
