package kukulam.module.designpatterns.strategy.logging;

public class LoggingClient {

    private LoggingStrategy logger;

    public LoggingClient(LoggingStrategy logger) {
        this.logger = logger;
    }

    void operation() {
        String message = "doing something";
        logger.log(message);
    }

    public static void main(String[] args) {
        LoggingStrategy logWithBigCharacters = new LoggerWithBigCharacters();
        LoggingStrategy logWithTime = new LoggerWithTime();

        LoggingClient client = new LoggingClient(logWithBigCharacters);
        client.operation();

        client = new LoggingClient(logWithTime);
        client.operation();
    }
}
