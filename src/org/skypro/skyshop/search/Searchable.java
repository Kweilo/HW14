package org.skypro.skyshop.search;

public interface Searchable {
    String getTerm();
    String contentType();
    String getName();
    default String getStringRepresentation() {
        return getName() + "-" + contentType();
    }
}
