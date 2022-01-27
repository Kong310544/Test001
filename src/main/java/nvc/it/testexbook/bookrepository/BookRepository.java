package nvc.it.testexbook.bookrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.testexbook.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> { 
    
}
