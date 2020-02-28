package kukulam.module.designpatterns.observer.pager;

import kukulam.module.designpatterns.singleton.Logger;

class Guard implements Observer {
    private String name;

    public Guard(String name) {
        this.name = name;
    }

    @Override
    public void alarm(Alert alert) {
        Logger.INSTANCE.logMessage("Guard " + name + " received alarm: " + alert);
    }
}
