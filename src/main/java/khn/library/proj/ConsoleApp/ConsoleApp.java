package khn.library.proj.ConsoleApp;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.HashMap;




import khn.library.proj.domain.Book;
import khn.library.proj.domain.BookCriteria;
import khn.library.proj.service.BookService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsoleApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext appCtx = 
        	new ClassPathXmlApplicationContext("applicationContext.xml");
        
         BookService bookService = (BookService)appCtx.getBean("bookService");
//         BookCriteria criteria = new BookCriteria("Spring Data", "Christine");
         BookCriteria criteria = null;
         
//         List<Book> BookList = new ArrayList<Book>();
//         List <Book> books = new ArrayList<Book>();
         System.out.println("before returning from search");
         List<Book> books = bookService.search(criteria); 
         System.out.println("after returning from search");
//         if (books != null) {
        	 System.out.println("after if");
        	 
        	 for (Book book : books){
        		 System.out.println(book.getIsbn());
        		 System.out.println(book.getName());
        		 System.out.println(book.getAuthor());
        	 }
//        	 Iterator<Book> BookIterator = BookList.iterator();
//        	 Iterator<String> CrunchifyIterator = CrunchifyList.iterator();
             /*while (CrunchifyIterator.hasNext()) {
                 System.out.println(CrunchifyIterator.next());*/
        	 
        	/* while(BookIterator.hasNext()) {
        		 
        		 System.out.println("book1");
        		 System.out.println("book2");
        		 System.out.println("book");
        	 }*/
         
    }
}

