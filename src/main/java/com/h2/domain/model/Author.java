package com.h2.domain.model;

public class Author {

    private Long id;
    private String name;

    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
