package decorator.example2;

/**
 * Created by ace on 08/01/2019.
 */
public class LaneDecorator extends DisplayDecorator {
    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("\t차선 표시");
    }
}
