package kukulam.module.designpatterns.strategy.logging;

import kukulam.module.designpatterns.singleton.Logger;

import java.time.LocalDateTime;

class LoggerWithTime implements LoggingStrategy {

    @Override
    public void log(String text) {
        String message = LocalDateTime.now() + " " + text;
        Logger.INSTANCE.logMessage(message);
    }
}


