package kukulam.module.designpatterns.proxy.cache.car;

import kukulam.module.designpatterns.singleton.Logger;

import java.util.HashMap;
import java.util.Map;

// Imitation of real database
class CarDatabaseRepository implements CarRepository {

    private Map<String, Car> cars = new HashMap<>();

    public CarDatabaseRepository() {
        this.cars.put(
                "bmw", new Car("bmw", "BMW 1"));
        this.cars.put(
                "mazda", new Car("mazda", "Mazda X"));
        this.cars.put(
                "mercedes", new Car("mercedes", "Mercedes A"));
    }

    @Override
    public Car findById(String id) {
        Logger.INSTANCE.logMessage(
                "Finding car with id " + id + " in database");
        return cars.get(id);
    }
}


