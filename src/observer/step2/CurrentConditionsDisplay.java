package observer.step2;

/**
 * Author : Jongchan Kim - ace.kim@navercorp.com
 * Created date : 14/12/2018
 */

/**
 * Display의 역할을 수행하는 객체를 DisplayElement 인터페이스로 공통되는 메서드에 대한 다형성을 처리
 * Weather Data를 지속적으로 구독하는 Observer이므로 Observer 인터페이스를 구현한다.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
