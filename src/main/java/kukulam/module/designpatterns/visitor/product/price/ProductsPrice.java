package kukulam.module.designpatterns.visitor.product.price;

class ProductsPrice implements Visitor {

    private double price = 0;

    @Override
    public void visit(Product product) {
        price += product.getPrice();
    }

    public double getPrice() {
        return price;
    }
}

