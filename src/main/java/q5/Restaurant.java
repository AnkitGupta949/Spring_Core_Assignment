package q5;

import org.springframework.beans.factory.annotation.Required;

public class Restaurant {


    private HotDrink hotDrink1;

    public HotDrink getHotDrink1() {
        return hotDrink1;
    }


@Required
    public void setHotDrink1(HotDrink hotDrink1) {
        this.hotDrink1 = hotDrink1;
    }
}
