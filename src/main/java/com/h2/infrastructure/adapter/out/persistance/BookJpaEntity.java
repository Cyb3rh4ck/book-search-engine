package com.h2.infrastructure.adapter.out.persistance;

import com.h2.domain.model.Author;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name =  "books")
public class BookJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    private String title;

    private BigDecimal rating;

    @Column(columnDefinition = "text")
    private String description;

    private String language;

    private String isbn;

    @Column(name = "book_format")
    private String bookFormat;

    private String edition;

    private Integer pages;

    private String publisher;

    @Column(name = "publish_date")
    private LocalDate publishDate;

    @Column(name = "first_publish_date")
    private LocalDate firstPublishDate;

    @Column(name = "liked_percent")
    private BigDecimal likedPercent;

    private BigDecimal price;

}
