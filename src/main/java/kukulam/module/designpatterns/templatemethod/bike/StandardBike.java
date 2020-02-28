package kukulam.module.designpatterns.templatemethod.bike;

class StandardBike extends BikeBuilder {

    @Override
    BikePart wheels() {
        return new BikePart("27inch wheels");
    }

    @Override
    BikePart frame() {
        return new BikePart("iron frame");
    }

    @Override
    BikePart handlebar() {
        return new BikePart("iron handlebar");
    }
}
