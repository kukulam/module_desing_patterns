package kukulam.module.designpatterns.factory.car;

import kukulam.module.designpatterns.singleton.Logger;

public class CarFactory {

    public static Car createCar(String type) {
        switch (type) {
            case "BMW":
                return new BMWF20();
            case "Mercedes":
                return new MercedesA35();
            default:
                throw new IllegalArgumentException("Car type not found");
        }
    }

    public static void main(String[] args) {
        Car bmw = CarFactory.createCar("BMW");
        Logger.INSTANCE.logMessage("Created car: " + bmw);

        Car mercedes = CarFactory.createCar("Mercedes");
        Logger.INSTANCE.logMessage("Created car: " + mercedes);


    }
}

