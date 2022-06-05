package bean;

import org.springframework.beans.factory.annotation.Autowired;

public class User1 {
    private String account;
    private String password;

    public User1(String account, String password) {
        this.account = account;
        this.password = password;
    }
    @Autowired
    public User1() {
        System.out.println("User1不延迟执行方法");
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
