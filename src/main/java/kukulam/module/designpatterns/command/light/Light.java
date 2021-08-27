package kukulam.module.designpatterns.command.light;

public class Light {
    private String color = "white";
    private double lux = 50.0;
    private boolean isOn = false;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLux() {
        return lux;
    }

    public void setLux(double lux) {
        this.lux = lux;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
