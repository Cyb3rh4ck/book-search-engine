package com.h2.application.service;

import com.h2.application.port.in.SearchBooksUseCase;
import com.h2.application.port.out.BookSearchPort;
import com.h2.domain.model.SearchResult;


import java.util.List;

public class SearchBooksService implements SearchBooksUseCase {

    private final BookSearchPort bookSearchPort;

    public SearchBooksService(BookSearchPort bookSearchPort) {
        this.bookSearchPort = bookSearchPort;
    }

    @Override
    public List<SearchResult> search(String query) {
        if (query == null || query.isBlank()) {
            return List.of();
        }

        String normalizedQuery = query.trim();

        if (normalizedQuery.length() < 2) {
            throw new IllegalArgumentException(
                    "Search query must contain at least 2 characteres"
            );
        }
        return  bookSearchPort.search(normalizedQuery);
    }
}
