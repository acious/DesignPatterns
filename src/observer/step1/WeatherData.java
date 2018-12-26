package observer.step1;

public class WeatherData {

    private Display currentConditionsDisplay = new Display();
    private Display statisticsDisplay = new Display();
    private Display forecastDisplay = new Display();

    /**
     * 개선 가능한 부분
     * 1. 구체적인 구현으로 되어있는 문제 - Display를 추상화시켜서 다형성을 활용 할 수 있음
     * 2. update 메서드에 모두 같은 인자가 전달 됨.
     */
    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    private float getPressure() {
        return 0;
    }

    private float getHumidity() {
        return 0;
    }

    private float getTemperature() {
        return 0;
    }
}
