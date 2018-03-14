package q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import q1.Database;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_config.xml");
        Restaurant restaurant=applicationContext.getBean("restaurant1",Restaurant.class);
        restaurant.getHotDrink1().prepareHotDrink();

            restaurant=applicationContext.getBean("restaurant2",Restaurant.class);
            restaurant.getHotDrink1().prepareHotDrink();
            }
}
