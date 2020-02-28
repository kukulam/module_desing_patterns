package kukulam.module.designpatterns.templatemethod.bike;

import kukulam.module.designpatterns.singleton.Logger;

import java.util.Arrays;
import java.util.List;

abstract class BikeBuilder {

    abstract BikePart wheels();
    abstract BikePart frame();
    abstract BikePart handlebar();

    final public Bike build() {
        List<BikePart> parts = Arrays.asList(wheels(), frame(), handlebar());
        return new Bike(parts);
    }

    public static void main(String[] args) {
        BikeBuilder bikeBuilder = new StandardBike();

        Bike standardBike = bikeBuilder.build();

        Logger.INSTANCE.logMessage(standardBike.toString());
    }
}
