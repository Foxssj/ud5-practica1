package com.utils.customer;

import com.utils.randomGenerator.RandomGenerator;

import java.util.Stack;

public class Customer {
    private String name;
    private int cantProducts;
    private int currentProducts;
    private Stack<String> products;


    public Customer() {
        this.name = RandomGenerator.RandomPerson();
        this.cantProducts = (int) (Math.random() * 10);
    }

    public void addProduct() {
        if (currentProducts < cantProducts) {
            String someProduct = RandomGenerator.RandomProduct();
            products.push(someProduct);
            System.out.println("You added a: " + someProduct);
        } else {
            System.out.println("The cart is full");
        }
    }

    public void removeProduct() {
        if (currentProducts > 0) {
            products.pop();
        } else {
            System.out.println("The cart is empty");
        }
    }

    public String showProducts() {
        String showedProducts = "";

        for (int i = 0; i < cantProducts; i++) {
            showedProducts += products.get(i) + ", \n";
        }
        return showedProducts;
    }

    public String ShowCustomerInfo() {
        return "* Nombre: " + name +"\n" +
                "* Total de productos: " + cantProducts +"\n" +
                "* Lista de artículos en la cesta:\n" +
                "* " + showProducts();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantProducts() {
        return cantProducts;
    }

    public void setCantProducts(int cantProducts) {
        this.cantProducts = cantProducts;
    }
}
