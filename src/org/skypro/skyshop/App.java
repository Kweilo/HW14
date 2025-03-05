package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Product cat = new SimpleProduct("Игрушка Кошка", 100);
        Product dog = new DiscountedProduct("Игрушка Собака", 100, 30 );
        Product fish = new FixPriceProduct("Игрушка Рыба");
        Product bread = new SimpleProduct("Игрушка Хбеб", 100);
        Product white = new SimpleProduct("Игрушка Белая", 100);
        Product black = new SimpleProduct("Игрушка Черная", 100);
        Article green = new Article("Бла бла бла", "Круто");

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
        SearchEngine search = new SearchEngine(5);
        search.add(green);
        search.add(cat);
        search.add(dog);
        System.out.println(Arrays.toString((search.search("Игрушка"))));
        System.out.println(Arrays.toString((search.search("Бла"))));

        basket.clearBasket();
        basket.printBasket();

        System.out.println(basket.basketCost());
        System.out.println(basket.hasName("Игрушка Кошка"));
    }
}
