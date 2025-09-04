package LibraryManagmentSystem.controller;

import LibraryManagmentSystem.DTO.BookRequest;
import LibraryManagmentSystem.DTO.BookResponse;
import LibraryManagmentSystem.model.Book;
import LibraryManagmentSystem.service.librarianS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("librarian")
public class librarianC {

    @Autowired
    librarianS service;

    @PostMapping
    public ResponseEntity<BookResponse> addBook(@RequestBody BookRequest bookReq){

        return ResponseEntity.status(HttpStatus.CREATED).body(service.addBook(bookReq));
    }
    @GetMapping
    public ResponseEntity<List<BookResponse>> getAllBooks() {
        List<BookResponse> response = service.getAllBook();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    @DeleteMapping
    public ResponseEntity<String> deleteBook(@RequestBody BookRequest book)
    {

        service.deleteBook(book);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Deleted book");
    }
    @PutMapping
    public ResponseEntity<BookResponse> updateBook(@RequestBody BookRequest book)
    {

        return ResponseEntity.status(HttpStatus.CREATED).body(service.updateBook(book));
    }
    @GetMapping("/{bookId}")
    public ResponseEntity<BookResponse> searchbyId(@PathVariable int bookId)
    {


        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.searchbyId(bookId));
    }


}
