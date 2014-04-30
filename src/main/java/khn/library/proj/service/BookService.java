package khn.library.proj.service;



import java.util.List;

import khn.library.proj.domain.Book;
import khn.library.proj.domain.search.BookCriteria;



public interface BookService {

    public List<Book> search(BookCriteria criteria);
    public Book findByIsbn(String isbn);
}
