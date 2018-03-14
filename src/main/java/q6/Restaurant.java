package q6;

import org.springframework.beans.factory.annotation.Autowired;


public class Restaurant {

    @Autowired
    private HotDrink hotDrink1;

    public HotDrink getHotDrink1() {
        return hotDrink1;
    }



    public void setHotDrink1(HotDrink hotDrink1) {
        this.hotDrink1 = hotDrink1;
    }
}
