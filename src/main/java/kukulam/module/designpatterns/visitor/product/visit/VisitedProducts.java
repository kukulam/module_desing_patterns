package kukulam.module.designpatterns.visitor.product.visit;


import java.util.LinkedList;
import java.util.List;

public class VisitedProducts implements Visitor {
    private List<Product> products = new LinkedList<>();

    @Override
    public void visit(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}

