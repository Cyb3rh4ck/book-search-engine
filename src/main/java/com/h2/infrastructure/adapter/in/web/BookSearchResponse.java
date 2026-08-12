package com.h2.infrastructure.adapter.in.web;

import java.math.BigDecimal;

public record BookSearchResponse (
    Long id,
    String title,
    BigDecimal rating,
    String isbn,
    double rank
) {
}
