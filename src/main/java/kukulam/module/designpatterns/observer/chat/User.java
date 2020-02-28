package kukulam.module.designpatterns.observer.chat;

import kukulam.module.designpatterns.singleton.Logger;

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void message(String text) {
        Logger.INSTANCE.logMessage(
                "User " + name + " received message: " + text);
    }
}


