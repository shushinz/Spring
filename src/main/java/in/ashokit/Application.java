package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		BookRepository repo = ctxt.getBean(BookRepository.class);
		System.out.println(repo);

	/*	Book b = new Book();
		b.setBookid(101);
		b.setBookname("chutiya");
		b.setBookPrice(1000.00);
		repo.save(b);

		System.out.println("Book Record is saved");
		
		*/
		
		Optional<Book> findById=repo.findById(101);
		System.out.println(findById.get());

	}

}
