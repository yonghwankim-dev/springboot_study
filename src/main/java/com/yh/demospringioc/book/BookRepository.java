package com.yh.demospringioc.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class BookRepository {

    @Autowired
    EntityManager em;

    public Book save(Book book){
        em.persist(book);
        return book;
    }

}
