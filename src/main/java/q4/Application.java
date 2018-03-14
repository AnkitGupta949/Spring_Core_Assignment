package q4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config4.xml");
        Restaurant restaurant = applicationContext.getBean("restaurant1", Restaurant.class);
        restaurant.getHotDrink1().prepareHotDrink();
        System.out.println(applicationContext.isPrototype("restaurant1"));

    }
}
