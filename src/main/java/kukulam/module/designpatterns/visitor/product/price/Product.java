package kukulam.module.designpatterns.visitor.product.price;

import kukulam.module.designpatterns.singleton.Logger;

import java.util.Arrays;
import java.util.List;

public class Product implements Visitable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public static void main(String[] args) {
        Product apple = new Product("Apple", 5.0);
        Product orange = new Product("Orange", 3.0);
        Product strawberry = new Product("strawberry", 2.0);

        List<Product> products = Arrays.asList(apple, orange, strawberry);

        ProductsPrice fruitsPrice = new ProductsPrice();

        for (Product product : products) {
            product.accept(fruitsPrice);
        }

        Logger.INSTANCE.logMessage("Fruits price: " + fruitsPrice.getPrice());
    }

}





