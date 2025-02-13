package org.skypro.skyshop.product;

public class FixPriceProduct extends Product{

    private static final int FIX_PRICE = 666;

    public FixPriceProduct(String name) {
        super(name);
    }
    @Override
    public int getPrice() {
        return FIX_PRICE;
    }
    @Override
    public String toString() {
        return getName() + ": Фиксированная цена " + getPrice();
    }
    @Override
    public boolean isSpecial() {
        return true;
    }
}
