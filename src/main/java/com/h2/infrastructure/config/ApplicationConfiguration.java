package com.h2.infrastructure.config;

import com.h2.application.port.in.SearchBooksUseCase;
import com.h2.application.port.out.BookSearchPort;
import com.h2.application.service.SearchBooksService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    SearchBooksUseCase searchBooksUseCase(BookSearchPort bookSearchPort) {
        return new SearchBooksService(bookSearchPort);
    }
}
