package khn.library.proj.service;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import khn.library.proj.domain.Book;
import khn.library.proj.domain.search.BookCriteria;

/**
 * @author Kathie
 *
 */
public class BookServiceImpl implements BookService{
	protected Map<String, Book> books;
	
	BookServiceImpl () {
		books = new HashMap<String, Book> ();
		
		books.put("0001", new Book("0001",
				"Spring Framework","Katherine", new GregorianCalendar(2014, 1, 12).getTime()));
		books.put("0002", new Book("0002",
				"Spring Data","Katherine", new GregorianCalendar(2014, 3, 12).getTime()));
		books.put("0003", new Book("0003",
				"Spring Integration","Ringo", new GregorianCalendar(2014, 3, 25).getTime()));
		books.put("0004", new Book("0004",
				"Spring In Action","Melissa", new GregorianCalendar(2013, 6, 7).getTime()));
	}
	@Override
	public List<Book> search(BookCriteria criteria) {
		/*For testing only*/
		/*criteria.setKeyword("Integration"); 
		criteria.setAuthor("");*/
		
		List<Book> booksFnd = new ArrayList<Book>();
		for (Book book : books.values()) {
            String keyword = criteria.getKeyword().trim();
            String author =  criteria.getAuthor().trim();
            boolean keywordMatches = keyword.length() > 0
                    && book.getName().contains(keyword);
            boolean authorMatches = book.getAuthor().equals(author);
            if (keywordMatches || authorMatches) {
                booksFnd.add(book);
            }
        }
		/*Stub implementation*/
		/*Book book;
		book = books.get("0001");
		results.add(book);
		book = books.get("0002");
		results.add(book);
		book = books.get("0003");
		results.add(book);
		book = books.get("0004");
		results.add(book);*/
		return booksFnd;
	}
	
	@Override
	public Book findByIsbn(String isbn) {
		/* not yet implemented */
		return books.get(isbn);
	}
	
}

