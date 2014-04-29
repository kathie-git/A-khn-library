package khn.library.proj.domain.search;

import java.io.Serializable;

/**
 * @author Kathie
 *
 */
public class BookCriteria implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected String keyword;
    protected String author;
    
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

