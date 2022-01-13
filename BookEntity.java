package study.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_info_tbl")
public class BookEntity {

	@Id
	private int Id;
	
	@Column
	private int Cost;
	
	@Column
	private String book_Name;

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int bookCost) {
		this.Cost = bookCost;
	}

	public String getBook_Name() {
		return book_Name;
	}

	public void setBookName(String book_Name) {
		this.book_Name = book_Name;
	}

	public BookEntity(int Id, int Cost, String book_Name) {
		super();
		this.Id = Id;
		this.Cost = Cost;
		this.book_Name = book_Name;
	}

	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BookEntity [Id=" + Id + ", Cost=" + Cost + ", book_Name=" + book_Name + "]";
	}
	
	
}

