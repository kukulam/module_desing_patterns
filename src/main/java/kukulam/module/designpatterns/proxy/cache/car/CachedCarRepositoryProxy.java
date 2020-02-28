package kukulam.module.designpatterns.proxy.cache.car;

import java.util.HashMap;

// Imitation of cache mechanism
class CachedCarRepositoryProxy implements CarRepository {
    private CarRepository databaseRepository;
    private HashMap<String, Car> cachedCars = new HashMap<>();

    public CachedCarRepositoryProxy(CarRepository databaseRepository) {
        this.databaseRepository = databaseRepository;
    }

    @Override
    public Car findById(String id) {
        Car cachedCar = cachedCars.get(id);
        if (cachedCar != null) {
            return cachedCar;
        } else {
            Car carFromDatabase = databaseRepository.findById(id);
            if (carFromDatabase != null && cachedCars.size() < 100) {
                cachedCars.put(id, carFromDatabase);
            }
            return carFromDatabase;
        }
    }
}

