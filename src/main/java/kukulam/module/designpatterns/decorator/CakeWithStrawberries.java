package kukulam.module.designpatterns.decorator;

import java.util.LinkedList;
import java.util.List;

class CakeWithStrawberries extends Cake {
    private Cake cake;

    public CakeWithStrawberries(Cake cake) {
        this.cake = cake;
    }

    @Override
    double price() {
        return cake.price() + 7.0;
    }

    @Override
    List<String> ingredients() {
        List<String> ingredients = new LinkedList<>(cake.ingredients());
        ingredients.add("Strawberries");
        return ingredients;
    }
}
