package kukulam.module.designpatterns.observer.chat;

import java.util.LinkedList;
import java.util.List;

public class Chat implements Observable {

    private List<Observer> observers = new LinkedList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void messageToAll(String message) {
        for (Observer observer : observers) {
            observer.message(message);
        }
    }

    public static void main(String[] args) {
        Observable chat = new Chat();

        Observer james = new User("James");
        Observer harry = new User("Harry");
        Observer mike = new User("Mike");

        chat.addObserver(james);
        chat.addObserver(harry);
        chat.addObserver(mike);

        chat.messageToAll("Example message");
    }
}





