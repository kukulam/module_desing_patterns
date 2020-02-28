package kukulam.module.designpatterns.factory.figure;

import kukulam.module.designpatterns.singleton.Logger;

class FigureFactory {

    public static Figure createCircle(double r) {
        return new Circle(r);
    }

    public static Figure createRectangle(double a, double b) {
        return new Rectangle(a, b);
    }

    public static void main(String[] args) {
        Figure circle = FigureFactory.createCircle(5);
        Logger.INSTANCE.logMessage(circle.toString());

        Figure rectangle = FigureFactory.createRectangle(2, 5);
        Logger.INSTANCE.logMessage(rectangle.toString());
    }
}
