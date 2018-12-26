package observer.step3;

import observer.step2.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Author : Jongchan Kim - ace.kim@navercorp.com
 * Created date : 14/12/2018
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current pressure: " + currentPressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
