package kukulam.module.designpatterns.singleton;

public enum Logger {
    INSTANCE;

    public void logMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Logger.INSTANCE.logMessage("Example message");
    }
}


