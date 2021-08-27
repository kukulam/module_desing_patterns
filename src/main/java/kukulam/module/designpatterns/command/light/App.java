package kukulam.module.designpatterns.command.light;

public class App {
    public static void main(String[] args) {
        Light light = new Light();
        LightController controller = new LightController(light);

        TurnOnCommand turnOnCommand = new TurnOnCommand(controller);
        ChangeColorCommand changeLightColor = new ChangeColorCommand(controller, "blue");
        ChangeIlluminance changeLightIlluminance = new ChangeIlluminance(controller, 100.0);
        PrintLightStatisticsCommand printLightStatistics = new PrintLightStatisticsCommand(controller);

        controller.operation(printLightStatistics);
        controller.operation(turnOnCommand);
        controller.operation(changeLightColor);
        controller.operation(changeLightIlluminance);
        controller.operation(printLightStatistics);
    }
}
