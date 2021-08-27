package kukulam.module.designpatterns.command.light;

public class ChangeIlluminance implements LightCommand {
    private final Light light;
    private final double lux;

    public ChangeIlluminance(LightController lightController, double lux) {
        this.light = lightController.getLight();
        this.lux = lux;
    }

    @Override
    public void execute() {
        light.setLux(lux);
    }
}



