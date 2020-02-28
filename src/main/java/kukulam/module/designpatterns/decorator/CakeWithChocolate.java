package kukulam.module.designpatterns.decorator;

import java.util.LinkedList;
import java.util.List;

class CakeWithChocolate extends Cake {
    private Cake cake;

    public CakeWithChocolate(Cake cake) {
        this.cake = cake;
    }

    @Override
    double price() {
        return cake.price() + 5.0;
    }

    @Override
    List<String> ingredients() {
        List<String> ingredients = new LinkedList<>(cake.ingredients());
        ingredients.add("Chocolate");
        return ingredients;
    }
}
