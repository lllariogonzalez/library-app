package interfaces;

import models.Users;
import java.util.List;

public interface UsersInterface {
    public void registerUser(Users user) throws Exception;
    public void editUser(Users user) throws Exception;
    public void deleteUser(int userId) throws Exception;
    public List<Users> getUsers(String email) throws Exception;
    public Users getUser(int userId) throws Exception;
}