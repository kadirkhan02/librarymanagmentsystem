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


    public void addBook(BookRequest bookRequest) {

        Book book=new Book();

        mp.map(bookRequest,book);
        bookrepo.save(book);

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
