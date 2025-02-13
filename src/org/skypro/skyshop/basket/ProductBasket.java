package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] basket = new Product[5];

    public Product[] getBasket() {
        return basket;
    }

    public void addProduct(Product product) {
        for (int index = 0; index < this.getBasket().length; index++) {
            if (this.getBasket()[index] == null) {
                this.getBasket()[index] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }
    public int basketCost() {
        int cost = 0;
        for (Product product : basket) {
            if (product != null) {
                cost += product.getPrice();
            }
        }
        return cost;
    }
    public void printBasket() {
        int specialProducts = 0;
        for (Product product : basket) {
            if (product != null) {
                System.out.println(product.toString());
                if (product.isSpecial()){
                    specialProducts++;
                }
            }
        }
        int cost = basketCost();
        if (cost > 0) {
            System.out.println("Итого " + basketCost());
            System.out.println("Специальных товаров: " + specialProducts);
        } else {
            System.out.println("B корзине пусто");
        }
    }
    public boolean hasName(String name) {
        for (Product product : basket) {
            if (product !=null && name.equals(product.getName())) {
                return true;
            }
        }
        return false;
    }
    public void clearBasket() {
        for (int i = 0; i < basket.length; i++) {
             basket[i] = null;
        }
    }
}
