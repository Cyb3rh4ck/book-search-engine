package com.h2.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Book {

    private Long id;
    private String title;
    private BigDecimal rating;
    private String description;
    private String language;
    private String isbn;
    private String bookFormat;
    private String edition;
    private Integer pages;
    private String publisher;
    private LocalDate publishDate;
    private LocalDate firstPublishDate;
    private BigDecimal likedPercent;
    private BigDecimal price;
    private List<Author> authors;

    public Book(Long id, String title, BigDecimal rating, String description, String language, String isbn, String bookFormat, String edition, Integer pages, String publisher, LocalDate publishDate, LocalDate firstPublishDate, BigDecimal likedPercent, BigDecimal price, List<Author> authors) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.description = description;
        this.language = language;
        this.isbn = isbn;
        this.bookFormat = bookFormat;
        this.edition = edition;
        this.pages = pages;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.firstPublishDate = firstPublishDate;
        this.likedPercent = likedPercent;
        this.price = price;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookFormat() {
        return bookFormat;
    }

    public String getEdition() {
        return edition;
    }

    public Integer getPages() {
        return pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public LocalDate getFirstPublishDate() {
        return firstPublishDate;
    }

    public BigDecimal getLikedPercent() {
        return likedPercent;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
