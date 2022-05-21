import dao.Dao;
import model.User;

import java.sql.SQLException;

public class LoginAction {
    private String account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute()  {

//        try {
//            User user = Dao.queryUserByAccount(account);
//            if ((user != null) && password.equals(user.getPassword())) {
//                return "success";
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//            return "fail";

        if (account.equals(password)) {
            return "success";
        } else {
            return "fail";
        }

    }

}
