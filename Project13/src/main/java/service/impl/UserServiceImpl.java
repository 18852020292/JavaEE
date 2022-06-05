package service.impl;

import dao.UserDao;
import entity.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public List<User> list(String text) {
        return userDao.list(text);
    }

    @Override
    public void add(User user) {
        userDao.edit(user);
    }

    @Override
    public void update(User user) {
        userDao.edit(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

    @Override
    public User getById(String id) {
        return userDao.getById(id);
    }

    // spring若是没有注解，也需要使用此方式来获取service实例
    // 同时在applicationContext.xml中需要配置bean标签置顶class
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
