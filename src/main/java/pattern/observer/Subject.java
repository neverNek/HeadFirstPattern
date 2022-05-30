package pattern.observer;

public interface Subject {
    void registerObserver(pattern.observer.Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

    float getTemperature();

    float getHumidity();

    float getPressure();
}
