package decorator.example1;

/**
 * Created by ace on 08/01/2019.
 */
public class SteamMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀 밀크";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
