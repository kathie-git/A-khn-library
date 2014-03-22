/**
 * 
 */
package khn.library.service;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import khn.library.domain.Book;
import khn.library.domain.BookCriteria;

/**
 * @author Kathie Nguyen
 *
 */

public class BookServiceImpl implements BookService{
	private Map<String, Book> books;
	
	BookServiceImpl () {
		books = new HashMap<String, Book> ();
		
		books.put("001", new Book("0001",
				"Spring Framework","Katherine", new GregorianCalendar(2014, 1, 12).getTime()));
		books.put("001", new Book("0002",
				"Spring Data","Christine", new GregorianCalendar(2014, 3, 12).getTime()));
		books.put("001", new Book("0001",
				"Spring Integration","Ringo", new GregorianCalendar(2014, 3, 25).getTime()));
		books.put("001", new Book("0001",
				"Spring In Action","Melissa", new GregorianCalendar(2013, 6, 7).getTime()));
	}
	@Override
	public List<Book> search(BookCriteria criteria) {
		List<Book> results = new ArrayList<Book>();
		for (Book book : books.values()) {
            String keyword = criteria.getKeyword().trim();
            String author = criteria.getAuthor().trim();
            boolean keywordMatches = keyword.length() > 0
                    && book.getName().contains(keyword);
            boolean authorMatches = book.getAuthor().equals(author);
            if (keywordMatches || authorMatches) {
                results.add(book);
            }
        }
		return results;
	}
	@Override
	public Book findByIsbn(String isbn) {
		return books.get(isbn);
	}
	
}
