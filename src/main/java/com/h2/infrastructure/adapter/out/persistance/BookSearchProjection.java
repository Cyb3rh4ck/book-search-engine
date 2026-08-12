package com.h2.infrastructure.adapter.out.persistance;

import java.time.LocalDate;

public interface BookSearchProjection {

    Long getBookId();

    String getTitle();

    Double getRating();

    String getDescription();

    String getLanguage();

    String getIsbn();

    String getBookFormat();

    String getEdition();

    Integer getPages();

    String getPublisher();

    LocalDate getPublishDate();

    LocalDate getFirstPublishDate();

    Double getLikedPercent();

    Double getPrice();

    Double getRank();
}
