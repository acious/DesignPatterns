package decorator.example2;

/**
 * Created by ace on 08/01/2019.
 */
public class DisplayDecorator extends Display {
    private Display decoratedDisplay;

    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
    }
}
