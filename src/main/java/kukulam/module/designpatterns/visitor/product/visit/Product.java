package kukulam.module.designpatterns.visitor.product.visit;

import kukulam.module.designpatterns.singleton.Logger;

import java.util.Arrays;
import java.util.List;

public class Product implements Visitable {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Product phone = new Product("Phone");
        Product laptop = new Product("Laptop");
        Product car = new Product("Car");

        List<Product> products = Arrays.asList(phone, laptop, car);

        VisitedProducts visitedProducts = new VisitedProducts();

        for (Product product : products) {
            product.accept(visitedProducts);
        }

        Logger.INSTANCE.logMessage("Visited product: " + visitedProducts.getProducts());
    }
}







