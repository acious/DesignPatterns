package decorator.example2;

/**
 * Created by ace on 08/01/2019.
 */
public class TrafficDecorator extends DisplayDecorator {
    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("\t교통량 표시");
    }
}
