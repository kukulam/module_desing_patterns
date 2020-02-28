package kukulam.module.designpatterns.templatemethod.computer;

public class ComputerPart {
    private String name;

    public ComputerPart(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ComputerPart{" +
                "name='" + name + '\'' +
                '}';
    }
}
