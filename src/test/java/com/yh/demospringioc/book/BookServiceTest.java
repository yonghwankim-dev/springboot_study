package com.yh.demospringioc.book;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookServiceTest {
    @Test
    public void save(){
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);

    }
}