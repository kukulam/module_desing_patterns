package kukulam.module.designpatterns.decorator;

import kukulam.module.designpatterns.singleton.Logger;

import java.util.Collections;
import java.util.List;

class Cake {

    double price() {
        return 10;
    }

    List<String> ingredients() {
            return Collections.emptyList();
    }

    @Override
    public String toString() {
        return "Cake{" +
                "price='" + price() + '\'' +
                ", ingredients='" + ingredients() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cake cake = new Cake();
        cake = new CakeWithChocolate(cake);
        cake = new CakeWithStrawberries(cake);
        Logger.INSTANCE.logMessage("Cake costs " + cake.price() + " with: " + cake.ingredients());

        Cake cakeWithStrawberriesAndChocolate =
                new CakeWithStrawberries(
                        new CakeWithChocolate(
                                new Cake()
                        )
                );
        Logger.INSTANCE.logMessage(cakeWithStrawberriesAndChocolate.toString());
    }
}