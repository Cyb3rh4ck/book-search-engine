--- We are using PostgreSQL
--- CSV Header is below, so we need to create a table with the same columns
--- bookId,title,author,rating,description,language,isbn,bookFormat,edition,pages,publisher,publishDate,firstPublishDate,likedPercent,price

--- Create the books table with the specified columns and data types
CREATE TABLE books (
    book_id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    rating DECIMAL(3, 2),
    description TEXT,
    language VARCHAR(50),
    isbn VARCHAR(20),
    book_format VARCHAR(50),
    edition VARCHAR(50),
    pages INT,
    publisher VARCHAR(255),
    publish_date DATE,
    first_publish_date DATE,
    liked_percent DECIMAL(5, 2),
    price DECIMAL(10, 2)
);

--- Create the authors table to store author information
CREATE TABLE authors (
    author_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

--- Create the book_authors table to establish a many-to-many relationship between books and authors
CREATE TABLE book_authors (
    book_id INT REFERENCES books(book_id) ON DELETE CASCADE,
    author_id INT REFERENCES authors(author_id) ON DELETE CASCADE,
    PRIMARY KEY (book_id, author_id)
);
