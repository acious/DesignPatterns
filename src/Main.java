import decorator.example1.*;
import decorator.example2.Display;
import decorator.example2.LaneDecorator;
import decorator.example2.RoadDisplay;
import decorator.example2.TrafficDecorator;

public class Main {

    public static void main(String[] args) {
//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());
//
//        Beverage beverage2 = new DarkRoast();
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Whip(beverage2);
//        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
//
//        Beverage beverage3 = new HouseBlend();
//        beverage3 = new Soy(beverage2);
//        beverage3 = new Mocha(beverage2);
//        beverage3 = new Whip(beverage2);
//        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        Display road = new RoadDisplay();
        road.draw();
        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();
        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();
    }
}
