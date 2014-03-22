package khn.library.service;

import java.util.List;

import khn.library.domain.Book;
import khn.library.domain.BookCriteria;


public interface BookService {

    public List<Book> search(BookCriteria criteria);
    public Book findByIsbn(String isbn);
}