package com.main;

public class Main {
    public static void main(String[] args) {
        Product dough = new Product("Тесто");
        Product flour = new Product("Мука");
        Product eggs = new Product("Яйца");
        Product water = new Product("Вода");

        Product cake = new Product("Торт");
        Product cacao = new Product("Какао");
        System.out.println(dough.addProduct(flour)); // true
        System.out.println(dough.addProduct(eggs)); // true
        System.out.println(dough.addProduct(water)); // true
        System.out.println(dough.addProduct(dough)); // false (self-reference)
        System.out.println(water.addProduct(dough)); // false
        System.out.println(cake.addProduct(cacao)); // true
        System.out.println(cake.addProduct(dough)); // true
        System.out.println(cake.addProduct(water)); // false (duplicate in cacao)
    }
}