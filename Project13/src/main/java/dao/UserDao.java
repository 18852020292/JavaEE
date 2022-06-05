package dao;

import entity.User;

import java.util.List;

public interface UserDao {

    List<User> list(String text);

    void edit(User student);

    void delete(String id);

    User getById(String id);

}
