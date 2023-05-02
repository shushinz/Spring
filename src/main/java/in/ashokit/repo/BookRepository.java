package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Book;

/*  BookRepositry is a special because it undergoes bootstrapping */
public interface BookRepository extends CrudRepository<Book, Integer> {

}
