
import bean.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println("使用前");
        User2 user2 = (User2) context.getBean("User2");
    }
}
