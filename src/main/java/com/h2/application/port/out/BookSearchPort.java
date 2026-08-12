package com.h2.application.port.out;

import java.util.List;
import java.util.Optional;

import com.h2.domain.model.Book;
import com.h2.domain.model.SearchResult;


public interface BookSearchPort {

   List<SearchResult> search(String query);

}
