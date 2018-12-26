package observer.step2;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : Jongchan Kim - ace.kim@navercorp.com
 * Created date : 14/12/2018
 */

/**
 * 옵저버에게 정보를 전달하는 Subject를 구현한 객체
 * 옵저버를 관리하고, 데이터를 옵저버들에게 전달하는 등의 역할을 수행함.
 * 이 과정에서 Subject와 Observer가 상호작용하는데, 서로 느슨한 결합 형태의 설계를 사용하여 "변경 사항"이 생겨도 큰 수정없이 활용 가능하다.
 */
public class WeatherData implements Subject {
    private List observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    // 옵저버 리스트에 display observer를 추가시켜서 등록
    // 느슨한 결합의 예시
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 옵저버의 구독을 해제
    // 느슨한 결합의 예시
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    // 모든 디스플레이의 update에 들어가는 3개의 인자들을 공통으로 묶어서 처리하여 문제를 해결
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
