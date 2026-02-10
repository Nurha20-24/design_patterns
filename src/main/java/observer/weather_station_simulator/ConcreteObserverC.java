package observer.weather_station_simulator;

public class ConcreteObserverC implements Observer {

    @Override
    public void update(double currentTemperature) {
        System.out.println("Current temperature: " + currentTemperature);
    }
}
