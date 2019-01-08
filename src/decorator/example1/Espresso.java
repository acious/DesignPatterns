package decorator.example1;

/**
 * Created by ace on 08/01/2019.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
