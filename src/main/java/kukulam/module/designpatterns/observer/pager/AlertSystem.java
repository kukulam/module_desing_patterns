package kukulam.module.designpatterns.observer.pager;

import java.util.LinkedList;
import java.util.List;

public class AlertSystem implements Observable {

    private List<Observer> observers = new LinkedList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void alarmAll(Alert alert) {
        for (Observer observer : observers) {
            observer.alarm(alert);
        }
    }

    public static void main(String[] args) {
        Observable alertSystem = new AlertSystem();

        Observer james = new Guard("James");
        Observer harry = new Guard("Harry");
        Observer mike = new Guard("Mike");

        alertSystem.addObserver(james);
        alertSystem.addObserver(harry);
        alertSystem.addObserver(mike);

        Alert alert = new Alert("intruder", "Intruder in house");

        alertSystem.alarmAll(alert);
    }
}

