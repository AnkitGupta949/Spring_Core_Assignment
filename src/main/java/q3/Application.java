package q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_config3.xml");
Complex complex=applicationContext.getBean("complexBean",Complex.class);
        System.out.println(complex.getList());
        System.out.println(complex.getSet());
        System.out.println(complex.getMap());

    }
}
