package com.h2.application.port.out;

import java.util.Optional;

import com.h2.domain.model.Author;

public interface AuthorRepositoryPort {

    Optional<Author> findByName(String name);

}
