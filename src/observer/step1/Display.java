package observer.step1;

public class Display {
    private float temp;
    private float humidity;
    private float pressure;

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}