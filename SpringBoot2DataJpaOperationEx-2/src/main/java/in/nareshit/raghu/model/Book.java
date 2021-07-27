package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="book_tab")
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	@Id
	@Column(name="bid")
	private Integer BookId;
	@Column(name="bname")
	private String BookName;
	@Column(name="bauthor")
	private String BoolAuthor;
	@Column(name="bcost")
	private Double BookCost;
	@Column(name="btype")
	private String BookType;
}
