package observer.weather_station_simulator;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Runnable {
    private double temperature;
    private double maximum = 40;
    private double minimum = -20;

    private List<Observer> observers = new ArrayList<>();

    public WeatherStation() {
        this.temperature = (int)(Math.random()* maximum) + minimum;
    }


    public void run() {
        while (true) {
            int change;
            if (Math.random() < 0.5) {
                change = -1;
            } else {
                change = +1;
            }
            double newTemperature = this.temperature + change;
            if (newTemperature > maximum) {
                this.temperature = maximum;
            } else if (newTemperature < minimum) {
                this.temperature = minimum;
            }
            else {
                this.temperature = newTemperature;
            }

            long time = (long)((Math.random() * 5000) + 1000);
            try {
                Thread.sleep(time);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            notifyObservers(this.temperature);
        }
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(double currentTemperature) {
        for (Observer observer : observers) {
            observer.update(currentTemperature);
        }
    }
}
