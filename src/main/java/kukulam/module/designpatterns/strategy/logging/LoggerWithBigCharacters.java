package kukulam.module.designpatterns.strategy.logging;

import kukulam.module.designpatterns.singleton.Logger;

class LoggerWithBigCharacters implements LoggingStrategy {

    @Override
    public void log(String text) {
        String message = text.toUpperCase();
        Logger.INSTANCE.logMessage(message);
    }
}


