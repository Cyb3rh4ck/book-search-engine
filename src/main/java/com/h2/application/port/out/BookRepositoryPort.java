package com.h2.application.port.out;

import java.util.List;
import java.util.Optional;

import com.h2.domain.model.Book;

public interface BookRepositoryPort {

    List<Book> searchBooks(String query);

    Optional<Book> findById(Long id);

    List<Book> findByAuthorName(String authorName);

}
