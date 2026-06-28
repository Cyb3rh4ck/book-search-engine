package com.h2.application.port.in;

import java.util.List;

import com.h2.domain.model.Book;

public interface SearchBooksUseCase {

    List<Book> searchBooks(String query);

}
