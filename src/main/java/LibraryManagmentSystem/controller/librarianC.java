package LibraryManagmentSystem.controller;

import LibraryManagmentSystem.DTO.BookRequest;
import LibraryManagmentSystem.DTO.BookResponse;
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
    public ResponseEntity<String> addBook(@RequestBody BookRequest bookReq){
        service.addBook(bookReq);
        return ResponseEntity.ok("Successfully Posted");
    }
    @GetMapping
    public ResponseEntity<List<BookResponse>> getAllBooks() {
        List<BookResponse> response = service.getAllBook();
        return ResponseEntity.ok(response);
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
