package khn.library.proj.webflow.action;


import java.util.Date;
import java.util.List;


import khn.library.proj.domain.Book;
import khn.library.proj.domain.BookCriteria;
import khn.library.proj.service.BookService;

import org.springframework.webflow.action.MultiAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

public class SearchBooksAction extends MultiAction {
	
		  
	private BookService bookService;
		  
		public void setBookService(BookService bookService) {
		    this.bookService = bookService;
		  }
		public Event searchBooks(RequestContext context) {
		    BookCriteria criteria = 
		      (BookCriteria)context.getFlowScope().get("bookCriteria");
		    if (criteria != null) {
		      List<Book> books = bookService.search(criteria);
		      context.getFlowScope().put("books",books);
		      
		      return success();       
		    }
		    /*else {
		      return error();
		    } */ 
			/*For testing only*/
		   return success();
		}
}

