package observer.weather_station_simulator;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        Observer observerC = new ConcreteObserverC();

        station.registerObserver(observerA);
        station.registerObserver(observerB);
        station.registerObserver(observerC);

        Thread t = new Thread(station);
        t.start();

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        station.removeObserver(observerC);
    }
}
