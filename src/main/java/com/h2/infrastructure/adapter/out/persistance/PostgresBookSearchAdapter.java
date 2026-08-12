package com.h2.infrastructure.adapter.out.persistance;

import com.h2.application.port.out.BookSearchPort;
import com.h2.domain.model.SearchResult;
import com.h2.domain.model.Book;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class PostgresBookSearchAdapter implements BookSearchPort {

    private final SpringDataBookRepository repository;

    public PostgresBookSearchAdapter(SpringDataBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<SearchResult> search(String query) {
        return repository.search(query)
                .stream()
                .map(this::toDomain)
                .toList();
    }

    private SearchResult toDomain(BookSearchProjection row) {
        Book book = new Book(
                row.getBookId(),
                row.getTitle(),
                BigDecimal.valueOf(row.getRating()),
                row.getDescription(),
                row.getLanguage(),
                row.getIsbn(),
                row.getBookFormat(),
                row.getEdition(),
                row.getPages(),
                row.getPublisher(),
                row.getPublishDate(),
                row.getFirstPublishDate(),
                BigDecimal.valueOf(row.getLikedPercent()),
                BigDecimal.valueOf(row.getPrice()),
                List.of()
        );
        return new SearchResult(book, row.getRank());
    }
}
