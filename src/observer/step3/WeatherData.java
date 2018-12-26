package observer.step3;

import java.util.Observable;

/**
 * Author : Jongchan Kim - ace.kim@navercorp.com
 * Created date : 14/12/2018
 */

/**
 * Observer 객체를 직접 구현하는 것이 아닌, Java에서 제공하는 Observable 객체를 활용하여
 * 직접 옵저버 패턴을 구현한 Observable(Subject)의 예시
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    // 옵저버 패턴에서 느슨한 결합의 예시
    // 옵저버 패턴에서 1:n 관계의 예시
    // 이곳에서 옵저버들에게 연락을 하는 순서를 정해버린다면 느슨한 결합 이라고 볼 수 없다.
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
