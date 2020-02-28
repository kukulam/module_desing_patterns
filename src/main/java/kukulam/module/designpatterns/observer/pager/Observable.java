package kukulam.module.designpatterns.observer.pager;

interface Observable {
    void addObserver(Observer observer);
    void alarmAll(Alert alert);
}