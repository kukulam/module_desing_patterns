package kukulam.module.designpatterns.factory.figure;

class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
