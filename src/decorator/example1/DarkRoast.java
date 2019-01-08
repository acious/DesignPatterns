package decorator.example1;

/**
 * Created by ace on 08/01/2019.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "다크 로스트";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
