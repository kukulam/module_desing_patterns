package kukulam.module.designpatterns.factory.car;

abstract class Car {
    abstract String model();
    abstract String type();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model() + '\'' +
                ", type='" + type() + '\'' +
                '}';
    }
}
