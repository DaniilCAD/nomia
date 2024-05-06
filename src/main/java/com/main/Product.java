package com.main;

import java.util.HashSet;
import java.util.Set;

public class Product {
    private final String name;
    private Set<Product> ingredients;

    public Product(String name) {
        this.name = name;
        this.ingredients = new HashSet<>();
    }

    public boolean addProduct(Product p) {
        if (p == this || containsInHierarchy(p) || p.containsInHierarchy(this)) {
            return false;
        }
        ingredients.add(p);
        return true;
    }

    private boolean containsInHierarchy(Product p) {
        if (ingredients.contains(p)) {
            return true;
        }
        for (Product ingredient : ingredients) {
            if (ingredient.containsInHierarchy(p)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
}