--- Así books.search_vector se genera automáticamente para postgresql v. 10
ALTER TABLE books
ADD COLUMN search_vector tsvector;

UPDATE books
SET search_vector =
    setweight(to_tsvector('english', coalesce(title, '')), 'A') ||
    setweight(to_tsvector('english', coalesce(description, '')), 'B');

CREATE INDEX idx_books_search_vector
ON books
USING GIN (search_vector);

CREATE FUNCTION books_search_vector_update()
RETURNS trigger AS $$
BEGIN
    NEW.search_vector :=
        setweight(to_tsvector('english', coalesce(NEW.title, '')), 'A') ||
        setweight(to_tsvector('english', coalesce(NEW.description, '')), 'B');

    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_books_search_vector_update
BEFORE INSERT OR UPDATE OF title, description
ON books
FOR EACH ROW
EXECUTE FUNCTION books_search_vector_update();