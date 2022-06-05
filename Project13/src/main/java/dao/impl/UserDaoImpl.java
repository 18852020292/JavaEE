package dao.impl;

import dao.BaseDao;
import dao.UserDao;
import entity.User;
import java.util.List;

import org.hibernate.Query;

@SuppressWarnings("unchecked")
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public List<User> list(String text) {
        String hql = "from User ";
        if (null != text && !"".equals(text) && !"查询:请输入名称...".equals(text)) {
            hql += "where name like '%" + text + "%' ";
        }
        Query query = getSession().createQuery(hql);
        return query.list();
    }


    @Override
    public void edit(User user) {
        getSession().saveOrUpdate(user);
    }

    @Override
    public void delete(String id) {
        Query query = getSession().createQuery("delete from User where id = " + id);
        query.executeUpdate();
    }

    @Override
    public User getById(String id) {
        Query query = getSession().createQuery("from User where id = " + id);
        return (User) query.list().get(0);
    }

}
