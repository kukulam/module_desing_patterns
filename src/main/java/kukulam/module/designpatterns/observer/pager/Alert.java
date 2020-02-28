package kukulam.module.designpatterns.observer.pager;

public class Alert {
    private String name;
    private String details;

    public Alert(String name, String details) {
        this.name = name;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "name='" + name + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
