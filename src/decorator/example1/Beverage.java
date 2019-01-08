package decorator.example1;

/**
 * Created by ace on 08/01/2019.
 */
public abstract class Beverage {
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
