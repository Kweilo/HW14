package org.skypro.skyshop.article;

import org.skypro.skyshop.search.Searchable;

public final class Article implements Searchable {
    private String name;
    private String text;

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + "\n" + text;
    }

    public String getTerm() {
        return toString();
    }

    public String contentType() {
        return "ARTICLE";
    }
}
