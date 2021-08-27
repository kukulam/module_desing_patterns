package kukulam.module.designpatterns.command.light;

public class PrintLightStatisticsCommand implements LightCommand {
    private final Light light;

    public PrintLightStatisticsCommand(LightController lightController) {
        this.light = lightController.getLight();
    }

    @Override
    public void execute() {
        System.out.println("Light statistics:");
        System.out.println("Is on: " + light.isOn());
        System.out.println("Color: " + light.getColor());
        System.out.println("Illuminance: " + light.getLux());
        System.out.println();
    }
}
