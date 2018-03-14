package q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_config.xml");
        Database database=applicationContext.getBean(Database.class);
        System.out.println("port : "+database.getPort()+" name : "+database.getName());
    }
}
