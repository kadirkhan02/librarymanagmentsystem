package LibraryManagmentSystem.controller;

import LibraryManagmentSystem.model.Book;
import LibraryManagmentSystem.service.librarianS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("librarian")
public class librarianC {

    @Autowired
    librarianS service;

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book){
        service.addBook(book);
        return ResponseEntity.ok("Successfully Posted");
    }
    @GetMapping
    public List<Book> getAllBook()
    {
        return service.getAllBook();
    }
    @DeleteMapping
    public void deleteBook(@RequestBody Book book)
    {
         service.deleteBook(book);
    }
    @PutMapping
    public void updateBook(@RequestBody Book book)
    {
        service.updateBook(book);
    }
    @GetMapping("/{bookId}")
    public Book searchbyId(@PathVariable int bookId)
    {
        return service.searchbyId(bookId);
    }


}
