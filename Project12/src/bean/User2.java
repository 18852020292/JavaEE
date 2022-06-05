package bean;

import org.springframework.beans.factory.annotation.Autowired;

public class User2 {
    private String account;
    private String password;

    public User2(String account, String password) {
        this.account = account;
        this.password = password;
    }
    @Autowired
    public User2() {
        System.out.println("User2延迟执行方法");
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

    public static void test(){
        System.out.println("执行方法");
    }
}
