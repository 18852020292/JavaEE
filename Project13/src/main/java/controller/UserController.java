package controller;

import entity.User;
import service.UserService;

import java.util.List;

@SuppressWarnings("serial")
public class UserController extends BaseController {

    private UserService userService;

    /**
     * list列表
     */
    private List<User> list;
    /**
     * 实体bean
     */
    private User user;

    public String list() {
        list = userService.list(searchText);
        return "list";
    }

    public String toAdd() {
        type = "add";
        return "add";
    }

    public String add() {
        System.out.println(123);
        userService.add(user);
        return "refresh";
    }

    public String toUpdate() {
        type = "update";
        user = userService.getById(id);
        return "update";
    }

    public String update() {
        userService.update(user);
        return "refresh";
    }

    public String delete() {
        userService.delete(id);
        return "refresh";
    }

    // 感觉这也是struts非常不爽的地方
    // 前台需要用到的变量总是需要set、get一下才行，springMVC中就不需要
    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // spring若是没有注解，也需要使用此方式来获取service实例
    // 同时在applicationContext.xml中需要配置bean标签置顶class
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
