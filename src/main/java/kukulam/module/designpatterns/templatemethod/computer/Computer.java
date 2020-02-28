package kukulam.module.designpatterns.templatemethod.computer;

import java.util.List;

public class Computer {
    private List<ComputerPart> parts;

    public Computer(List<ComputerPart> parts) {
        this.parts = parts;
    }

    public List<ComputerPart> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "parts=" + parts +
                '}';
    }
}

