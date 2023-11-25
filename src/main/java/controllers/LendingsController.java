package controllers;

import models.Lendings;
import java.util.List;
import db.DAOLendingsImpl;

public class LendingsController extends DAOLendingsImpl {

  @Override
  public void registerLending(Lendings lending) throws Exception {
    try {
      super.registerLending(lending);
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public void editLending(Lendings lending) throws Exception {
    try {
      super.editLending(lending);
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public void deleteLending(int lendingId) throws Exception {
    try {
      super.deleteLending(lendingId);
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public List<Lendings> getLendings() throws Exception {
    List<Lendings> lista = null;
    try {
      lista = super.getLendings();
    } catch (Exception e) {
      throw e;
    }
    return lista;
  }

  @Override
  public Lendings getLending(int userId, int bookId) throws Exception {
    Lendings lending = null;
    try {
      lending = super.getLending(userId, bookId);
    } catch (Exception e) {
      throw e;
    }
    return lending;
  }
}
