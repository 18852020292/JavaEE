package dao;

import model.User;

import java.sql.*;

/**
 * @author 刘杰
 */
public class Dao {
    /**
     * 获取数据库连接
     * URL 数据库连接地址
     * USER 数据库用户名
     * PASSWORD 数据库密码
     * DRIVER 数据库驱动
     * USER_TABLE 用户表名
     */
    private static final String URL = "jdbc:mysql://localhost:3306/project";
    private static final String USER = "root";
    private static final String PASSWORD = "1684468347";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER_TABLE = "user";

    /**
     * 获取数据库连接
     * @return 数据库连接
     */
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭数据库连接
     * @param conn [连接对象]
     */
    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据用户名查询用户信息
     * @param account [用户名]
     * @return [用户]
     * @throws SQLException
     */
    public static User queryUserByAccount(String account) throws SQLException {
        Connection conn = getConnection();
        if (conn == null) {
            System.out.println("数据库连接有问题，请检查密码，数据库名与数据库连接jar包是否配置正确");
            return null;
        }
        User user = null;
        try {
            String sql = "select * from " + USER_TABLE + " where account = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, account);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                user = new User(rs.getString("account"), rs.getString("password"));
            }
        } finally {
            closeConnection(conn);
        }
        return user;
    }

    public static void main(String[] args) {
        User user = null;
        try {
            user = queryUserByAccount("123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}