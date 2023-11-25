package controllers;

import models.Books;
import java.util.List;
import db.DAOBooksImpl;

public class BooksController extends DAOBooksImpl {

  @Override
  public void registerBook(Books book) throws Exception {
    try {
      super.registerBook(book);
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public void editBook(Books book) throws Exception {
    try {
      super.editBook(book);
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public void deleteBook(int bookId) throws Exception {
    try {
      super.deleteBook(bookId);
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public List<Books> getBooks(String title) throws Exception {
    List<Books> lista = null;
    try {
      lista = super.getBooks(title);
    } catch (Exception e) {
      throw e;
    }
    return lista;
  }

  @Override
  public Books getBook(int bookId) throws Exception {
    Books book = null;
    try {
      book = super.getBook(bookId);
    } catch (Exception e) {
      throw e;
    }
    return book;
  }
}
