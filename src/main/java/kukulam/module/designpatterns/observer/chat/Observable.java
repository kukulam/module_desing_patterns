package kukulam.module.designpatterns.observer.chat;

interface Observable {
    void addObserver(Observer observer);
    void messageToAll(String text);
}

