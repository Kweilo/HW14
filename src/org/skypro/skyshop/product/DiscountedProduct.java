package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int baseCost;
    private int discount;

    public DiscountedProduct(String name, int baseCost, int discount) {
        super(name);
        this.baseCost = baseCost;
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return baseCost * (1 - discount / 100);
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (" + discount + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}