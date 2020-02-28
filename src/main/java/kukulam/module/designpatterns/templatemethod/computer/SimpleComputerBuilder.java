package kukulam.module.designpatterns.templatemethod.computer;

public class SimpleComputerBuilder extends ComputerBuilder {

    @Override
    ComputerPart motherboard() {
        return new ComputerPart("Gigabyte 100mx");
    }

    @Override
    ComputerPart cpu() {
        return new ComputerPart("Intel i5");
    }

    @Override
    ComputerPart gpu() {
        return new ComputerPart("Nvidia 1050");
    }
}
