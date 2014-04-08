package khn.library.proj.domain;

import java.io.Serializable;

/**
 * @author Kathie
 *
 */
public class BookCriteria implements Serializable {
	public static final long serialUID = 1L;
	private String keyword;
    private String author;
    
    public BookCriteria() {}
    
    public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}

