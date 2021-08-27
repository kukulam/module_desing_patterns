package kukulam.module.designpatterns.command.light;

public class TurnOffCommand implements LightCommand {
    private final Light light;

    public TurnOffCommand(LightController lightController) {
        this.light = lightController.getLight();
    }

    @Override
    public void execute() {
        light.setOn(false);
    }
}
