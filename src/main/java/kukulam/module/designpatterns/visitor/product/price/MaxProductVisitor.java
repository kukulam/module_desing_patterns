package kukulam.module.designpatterns.visitor.product.price;

class MaxProductVisitor implements Visitor {

    private double maxPrice = 0;

    @Override
    public void visit(Product product) {
        if (maxPrice < product.getPrice())
            maxPrice = product.getPrice();
    }

    public double getMaxPrice() {
        return maxPrice;
    }
}
