package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product cat = new Product("Игрушка Кошка", 100);
        Product dog = new Product("Игрушка Собака", 100);
        Product fish = new Product("Игрушка Рыба", 100);
        Product bread = new Product("Игрушка Хбеб", 100);
        Product white = new Product("Игрушка Белая", 100);
        Product black = new Product("Игрушка Черная", 100);

        ProductBasket basket = new ProductBasket();

        basket.addProduct(cat);
        basket.addProduct(dog);
        basket.addProduct(fish);
        basket.addProduct(bread);
        basket.addProduct(white);
        basket.addProduct(black);

        basket.printBasket();

        System.out.println(basket.basketCost());

        System.out.println(basket.hasName("Игрушка Кошка"));
        System.out.println(basket.hasName("Игрушка Гусь"));

        basket.clearBasket();
        basket.printBasket();

        System.out.println(basket.basketCost());
        System.out.println(basket.hasName("Игрушка Кошка"));
    }
}
