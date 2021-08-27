package kukulam.module.designpatterns.command.light;

public class LightController {
    private final Light light;

    public LightController(Light light) {
        this.light = light;
    }

    public void operation(LightCommand lightCommand) {
        lightCommand.execute();
    }

    public Light getLight() {
        return light;
    }
}

