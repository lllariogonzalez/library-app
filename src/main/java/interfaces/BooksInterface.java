package interfaces;

import models.Books;
import java.util.List;

public interface BooksInterface {
    public void registerBook(Books book) throws Exception;
    public void editBook(Books book) throws Exception;
    public void deleteBook(int bookId) throws Exception;
    public List<Books> getBooks(String title) throws Exception;
    public Books getBook(int bookId) throws Exception;
}
