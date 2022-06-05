package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class BaseDao extends HibernateDaoSupport {

    /**
     * 获取hibernate操作数据库的session
     *
     * @return Session
     */
    protected Session getSession() {
        try {
            SessionFactory sessionFactory = getHibernateTemplate().getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            if (null == session) {
                session = sessionFactory.openSession();
            }
            return session;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }

}
