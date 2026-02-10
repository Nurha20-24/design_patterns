package observer.weather_station_simulator;

public class ConcreteObserverA implements Observer {

    @Override
    public void update(double currentTemperature) {
        System.out.println("Temperature now: " + currentTemperature);
    }
}
