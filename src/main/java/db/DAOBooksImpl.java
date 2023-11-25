package db;

import interfaces.BooksInterface;
import models.Books;
import java.util.List;
import java.util.stream.Collectors;

public class DAOBooksImpl implements BooksInterface {

    private List<Books> books;
    private DAOService<Books> db;
    private String dataLibrary = "dataLibrary.json";

    public DAOBooksImpl() {
        db = new DAOService<Books>();
        books = db.loadFile(dataLibrary, Books.class);
    }

    @Override
    public void registerBook(Books book) throws Exception {
        book.setId(books.size() + 1);
        books.add(book);
        db.saveFile(books, dataLibrary);
    }

    @Override
    public void editBook(Books editBook) throws Exception {
        books = books.stream()
                .map(book -> book.getId() == editBook.getId() ? editBook : book)
                .collect(Collectors.toList());
        db.saveFile(books, dataLibrary);
    }

    @Override
    public void deleteBook(int bookId) throws Exception {
        books.removeIf(book -> book.getId() == bookId);
        db.saveFile(books, dataLibrary);
    }

    @Override
    public List<Books> getBooks(String title) throws Exception {
        books = db.loadFile(dataLibrary, Books.class);
        if (title.isEmpty()) {
            return books;
        } else {
            return books.stream()
                    .filter(libro -> libro.getTitle().toLowerCase().contains(title.toLowerCase()))
                    .collect(Collectors.toList());
        }
    }

    @Override
    public Books getBook(int bookId) throws Exception {
        books = db.loadFile(dataLibrary, Books.class);
        return books.stream()
                .filter(book -> book.getId() == bookId)
                .findFirst()
                .orElse(null);
    }

}
