import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;

/**
 * @author 刘杰
 */
public class UserTest {
    public static void main(String[] args) throws ParseException {
        Configuration configure = new Configuration().configure();
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();

        add(session);
        delete(session);
        update(session);
        query(session);

        session.close();
        sessionFactory.close();
        serviceRegistry.close();
    }

    /**
     * 添加用户
     * @param session
     */
    public static void add(Session session){
        User user = new User("admin", "admin");
        session.save(user);
        session.beginTransaction().commit();
    }

    /**
     * 删除用户
     * @param session
     */
    public static void delete(Session session){
        //要删除的用户id
        int id = 22;
        User user = session.get(User.class, id);
        session.delete(user);
        session.beginTransaction().commit();
    }

    /**
     * 更新用户
     * @param session
     */
    public static void update(Session session){
        //要修改的用户id
        int id = 19;
        User user = session.get(User.class, id);
        user.setAccount("123");
        session.update(user);
        session.beginTransaction().commit();
    }

    /**
     * 查询用户
     * @param session
     */
    public static void query(Session session){
        //要查询的用户id
        int id = 19;
        User user = (User) session.get(User.class, id);
        System.out.println("get：" + user.getAccount());
    }
}
