package LibraryManagmentSystem.service;

import LibraryManagmentSystem.DTO.BookRequest;
import LibraryManagmentSystem.DTO.BookResponse;
import LibraryManagmentSystem.model.Book;
import LibraryManagmentSystem.repo.Bookrepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
@RequiredArgsConstructor
public class librarianS {

    @Autowired
    Book book;
    private final Bookrepo bookrepo;
    private final ModelMapper mp;
    List<Book> l=new ArrayList<>();


    public BookResponse addBook(BookRequest bookRequest) {

        Book book=mp.map(bookRequest, Book.class);
        bookrepo.save(book);
        return mp.map(book,BookResponse.class);

    }

    public List<BookResponse> getAllBook() {

       List<Book>book=bookrepo.findAll();
       List<BookResponse> bookResponses   =new ArrayList<>();
       for(Book b:book)
       {
           BookResponse br=new BookResponse();
           br.setBookname(b.getBookname());
           br.setTitle(b.getTitle());
           br.setAvailable(b.isAvailable());
           bookResponses.add(br);
       }
       return bookResponses;
    }


    public void deleteBook(BookRequest book) {

        Book b=mp.map(book,Book.class);
        bookrepo.delete(b);
    }

    public BookResponse updateBook(BookRequest book) {

        Book b=mp.map(book, Book.class);
        bookrepo.save(b);
        return mp.map(b, BookResponse.class);
    }

    public BookResponse searchbyId(int bookId) {

        Book book1=bookrepo.getReferenceById(bookId);
        BookResponse bookResponse= mp.map(book1, BookResponse.class);
        return bookResponse;
    }
}
