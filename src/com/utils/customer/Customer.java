package com.utils.customer;

import com.utils.randomGenerator.RandomGenerator;

import java.util.Stack;

public class Customer {
    private String name;
    private int cantProducts;
    private int currentProducts = 0;
    private Stack<String>[] products;

    public Customer(String name, int cantProducts) {
        this.name = name;
        this.cantProducts = cantProducts;
    }

    public Customer(int cantProducts) {
        this.name = RandomGenerator.RandomPerson();
        this.cantProducts = cantProducts;
    }

    public void addProduct() {
        if (currentProducts < cantProducts) {
            String someProduct = RandomGenerator.RandomProduct();
            products[currentProducts].push(someProduct);
            System.out.println("You added a: " + someProduct);
        } else {
            System.out.println("The cart is full");
        }

    }

}
