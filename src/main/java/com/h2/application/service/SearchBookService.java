package com.h2.application.service;

import java.util.List;

import com.h2.application.port.in.SearchBooksUseCase;
import com.h2.application.port.out.BookRepositoryPort;
import com.h2.domain.model.Book;

public class SearchBookService implements SearchBooksUseCase {

    private final BookRepositoryPort bookRepositoryPort;

    public SearchBookService(BookRepositoryPort bookRepositoryPort) {
        this.bookRepositoryPort = bookRepositoryPort;
    }

    @Override
    public List<Book> searchBooks(String query) {
        if (query == null || query.isBlank()) {
            throw new IllegalArgumentException("Search query cannot be null or empty");
        }
        
        return bookRepositoryPort.searchBooks(query);
    }

}
