package kukulam.module.designpatterns.proxy.cache.car;

import kukulam.module.designpatterns.singleton.Logger;

import java.util.HashMap;
import java.util.Map;

// Imitation of real database
class CarDatabaseRepository implements CarRepository {

    private Map<String, Car> cars = new HashMap<>();

    public CarDatabaseRepository() {
        this.cars.put(
                "bmw_1", new Car("BMW 1", "bmw_1"));
        this.cars.put(
                "mazda_x", new Car("Mazda X", "mazda_x"));
        this.cars.put(
                "mercedes_a", new Car("Mercedes A", "mercedes_a"));
    }

    @Override
    public Car findById(String id) {
        Logger.INSTANCE.logMessage(
                "Finding car with id " + id + " in database");
        return cars.get(id);
    }
}


