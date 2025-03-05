package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private String name;


    public Product(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
    public abstract int getPrice();

    public boolean isSpecial() {
       return false;
    }
    public String getTerm() {
        return name;
    }
    public String contentType() {
        return "PRODUCT";
    }
}
