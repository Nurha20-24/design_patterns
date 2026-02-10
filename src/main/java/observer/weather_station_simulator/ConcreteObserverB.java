package observer.weather_station_simulator;

public class ConcreteObserverB implements Observer {

    @Override
    public void update(double currentTemperature) {
        System.out.println("Update temp: " + currentTemperature);
    }
}
