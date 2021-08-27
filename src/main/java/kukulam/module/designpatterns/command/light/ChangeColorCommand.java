package kukulam.module.designpatterns.command.light;

public class ChangeColorCommand implements LightCommand {
    private final Light light;
    private final String color;

    public ChangeColorCommand(LightController lightController, String color) {
        this.light = lightController.getLight();
        this.color = color;
    }

    @Override
    public void execute() {
        light.setColor(color);
    }
}

