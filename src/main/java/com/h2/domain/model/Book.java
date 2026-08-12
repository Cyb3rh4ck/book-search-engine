package com.h2.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public record Book(
        Long id,
        String title,
        BigDecimal rating,
        String description,
        String language,
        String isbn,
        String bookFormat,
        String edition,
        Integer pages,
        String publisher,
        LocalDate publishDate,
        LocalDate firstPublishDate,
        BigDecimal likedPercent,
        BigDecimal price,
        List<Author> authors
) {
}
