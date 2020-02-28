package kukulam.module.designpatterns.proxy.cache.car;


import kukulam.module.designpatterns.singleton.Logger;

class Car {
    private String name;
    private String id;

    public Car(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CarRepository carRepository = new CachedCarRepositoryProxy(new CarDatabaseRepository());

        Car bmw1 = carRepository.findById("bmw");
        Logger.INSTANCE.logMessage("Founded car: " + bmw1);

        Car bmw2 = carRepository.findById("bmw");
        Logger.INSTANCE.logMessage("Founded car: " + bmw2);

        Car bmw3 = carRepository.findById("bmw");
        Logger.INSTANCE.logMessage("Founded car: " + bmw3);

        Car mercedes1 = carRepository.findById("mercedes");
        Logger.INSTANCE.logMessage("Founded car: " + mercedes1);

        Car mercedes2 = carRepository.findById("mercedes");
        Logger.INSTANCE.logMessage("Founded car: " + mercedes2);
    }
}





