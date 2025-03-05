package org.skypro.skyshop.search;

import java.sql.Array;

public class SearchEngine {
    private Searchable[] searchArray;

    private Searchable[] searchResult = new Searchable[5];

    private int arraySize;

    public SearchEngine(int arraySize) {
        this.searchArray = new Searchable[arraySize];
        this.arraySize = arraySize;
    }

    public Searchable[] search(String searchString) {
        int searchCount = 0;
        for (Searchable element : searchArray) {
            if (searchCount < 5) {
               if(element != null && element.getTerm().contains(searchString)) {
                   searchResult[searchCount] = element;
                   searchCount++;
               }
            } else {
                break;
            }
        }
        return searchResult;
    }

    public void add(Searchable newObject) {
        for (int i = 0; i < arraySize; i++) {
            if (searchArray[i] == null) {
                searchArray[i] = newObject;
                break;
            }
        }
    }
}

