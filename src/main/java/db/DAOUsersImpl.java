package db;

import interfaces.UsersInterface;
import models.Users;
import java.util.List;
import java.util.stream.Collectors;

public class DAOUsersImpl implements UsersInterface {

    private List<Users> users;
    private DAOService<Users> db;
    private String dataUsers = "dataUsers.json";

    public DAOUsersImpl() {
        db = new DAOService<Users>();
        users = db.loadFile(dataUsers, Users.class);
    }

    @Override
    public void registerUser(Users user) throws Exception {
        user.setId(users.size() + 1);
        users.add(user);
        db.saveFile(users, dataUsers);
    }

    @Override
    public void editUser(Users editUser) throws Exception {
        users = users.stream()
                .map(user -> user.getId() == editUser.getId() ? editUser : user)
                .collect(Collectors.toList());
        db.saveFile(users, dataUsers);
    }

    @Override
    public void deleteUser(int userId) throws Exception {
        users.removeIf(user -> user.getId() == userId);
        db.saveFile(users, dataUsers);
    }

    @Override
    public List<Users> getUsers(String email) throws Exception {
        users = db.loadFile(dataUsers, Users.class);
        if (email.isEmpty()) {
            return users;
        } else {
            return users.stream()
                    .filter(libro -> libro.getEmail().toLowerCase().contains(email.toLowerCase()))
                    .collect(Collectors.toList());
        }
    }

    @Override
    public Users getUser(int userId) throws Exception {
        users = db.loadFile(dataUsers, Users.class);
        return users.stream()
                .filter(user -> user.getId() == userId)
                .findFirst()
                .orElse(null);
    }

}
