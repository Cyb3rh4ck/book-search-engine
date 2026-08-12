package com.h2.infrastructure.adapter.in.web;

import com.h2.application.port.in.SearchBooksUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookSearchController {

    private final SearchBooksUseCase searchBooksUseCase;

    public BookSearchController(SearchBooksUseCase searchBooksUseCase) {
        this.searchBooksUseCase = searchBooksUseCase;
    }

    @GetMapping("/search")
    public List<BookSearchResponse> search(@RequestParam String q) {
        return searchBooksUseCase.search(q)
                .stream()
                .map(result ->
                        new BookSearchResponse (
                                result.book().id(),
                                result.book().title(),
                                result.book().rating(),
                                result.book().isbn(),
                                result.rank()
                        )
                )
                .toList();

    }
}
