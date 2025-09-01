package LibraryManagmentSystem.repo;

import LibraryManagmentSystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepo extends JpaRepository<Book, Integer> {
}
