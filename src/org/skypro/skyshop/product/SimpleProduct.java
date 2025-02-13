package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private int cost;

    public SimpleProduct(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public int getPrice() {
        return cost;
    }
    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }
}
