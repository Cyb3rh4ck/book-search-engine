package com.h2.application.port.in;

import java.util.List;

import com.h2.domain.model.SearchResult;

public interface SearchBooksUseCase {

    List<SearchResult> search(String query);

}
