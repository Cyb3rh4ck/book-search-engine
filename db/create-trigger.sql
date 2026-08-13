CREATE TRIGGER trg_books_search_vector_update
BEFORE INSERT OR UPDATE OF title, description
ON books
FOR EACH ROW
EXECUTE PROCEDURE books_search_vector_update();