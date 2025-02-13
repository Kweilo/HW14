package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        Product cat = new SimpleProduct("Игрушка Кошка", 100);
        Product dog = new DiscountedProduct("Игрушка Собака", 100, 30 );
        Product fish = new FixPriceProduct("Игрушка Рыба");
        Product bread = new SimpleProduct("Игрушка Хбеб", 100);
        Product white = new SimpleProduct("Игрушка Белая", 100);
        Product black = new SimpleProduct("Игрушка Черная", 100);

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
