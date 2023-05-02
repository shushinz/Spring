package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Book {

	@Id
	private Integer bookid;
	private String bookname;
	private Double bookPrice;

}
