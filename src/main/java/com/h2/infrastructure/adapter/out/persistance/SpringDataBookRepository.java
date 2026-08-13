package com.h2.infrastructure.adapter.out.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpringDataBookRepository extends JpaRepository<BookJpaEntity, Long> {

    @Query(value = """
            SELECT
                b.book_id AS bookId,
                b.title AS title,
                b.rating AS rating,
                b.description AS description,
                b.language AS language,
                b.isbn AS isbn,
                b.book_format AS bookFormat,
                b.edition AS edition,
                b.pages AS pages,
                b.publisher AS publisher,
                b.publish_date AS publishDate,
                b.first_publish_date AS firstPublishDate,
                b.liked_percent AS likedPercent,
                b.price AS price,
                ts_rank(
                    b.search_vector,
                    plainto_tsquery('english', :query)
                ) AS rank
            FROM books b
            WHERE b.search_vector @@
                  plainto_tsquery('english', :query)
            ORDER BY rank DESC
            LIMIT 50
            """, nativeQuery = true)
    List<BookSearchProjection> search(@Param("query") String query);

}
