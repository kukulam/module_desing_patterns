package kukulam.module.designpatterns.command.light;

public class TurnOnCommand implements LightCommand {
    private final Light light;

    public TurnOnCommand(LightController lightController) {
        this.light = lightController.getLight();
    }

    @Override
    public void execute() {
        light.setOn(true);
    }
}
