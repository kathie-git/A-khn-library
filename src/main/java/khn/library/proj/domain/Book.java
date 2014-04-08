package khn.library.proj.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Kathie Nguyen
 *
 */
public class Book implements Serializable {
		private static final long serialVersionUID = 1L;
	    private String isbn;
	    private String name;
	    private String author;
	    private Date publishDate;
	    
	    public Book() {};
	    
	    public Book(String isbn, String name, String author, Date publishDate) {
	    	this.setIsbn(isbn);
	    	this.setName(name);
	    	this.setAuthor(author);
	    	this.publishDate = publishDate;
	    }

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
}

