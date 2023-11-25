package controllers;

import models.Users;
import java.util.List;
import db.DAOUsersImpl;

public class UsersController extends DAOUsersImpl {

  @Override
  public void registerUser(Users user) throws Exception {
    try {
      super.registerUser(user);
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public void editUser(Users user) throws Exception {
    try {
      super.editUser(user);
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public void deleteUser(int userId) throws Exception {
    try {
      super.deleteUser(userId);
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public List<Users> getUsers(String email) throws Exception {
    List<Users> list = null;
    try {
      list = super.getUsers(email);
    } catch (Exception e) {
      throw e;
    }
    return list;
  }

  @Override
  public Users getUser(int userId) throws Exception {
    Users user = null;
    try {
      user = super.getUser(userId);
    } catch (Exception e) {
      throw e;
    }
    return user;
  }
}
