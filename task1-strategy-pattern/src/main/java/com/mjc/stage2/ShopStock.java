package com.mjc.stage2;

import java.util.List;

public class ShopStock  {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> executeFilteringStrategy(FilteringStrategy filteringStrategy){
        for (Product product:productList) {
            filteringStrategy.filter(product);
        }
        return productList;
    }
}
