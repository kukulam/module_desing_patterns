package kukulam.module.designpatterns.templatemethod.computer;

import kukulam.module.designpatterns.singleton.Logger;

import java.util.Arrays;
import java.util.List;

public abstract class ComputerBuilder {

    abstract ComputerPart motherboard();
    abstract ComputerPart cpu();
    abstract ComputerPart gpu();

    final Computer build() {
        List<ComputerPart> parts = Arrays.asList(motherboard(), gpu(), cpu());
        return new Computer(parts);
    }

    public static void main(String[] args) {
        ComputerBuilder builder = new SimpleComputerBuilder();
        Computer computer = builder.build();

        Logger.INSTANCE.logMessage(computer.toString());
    }
}


