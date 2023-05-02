package com.utils.cashier;

import java.util.Stack;

public class Cashier {
    //5. Desarrolla una clase que represente al cajero/a. En esta clase, considera los atributos
    //mínimos requeridos y desarrolla los métodos necesarios para interactuar con la fila de
    //clientes.
    //* Número de caja: <Número de caja>:
    //* Total de clientes: <Número de clientes>
    //* Clientes en la fila:
    //<Nombre cliente 1>
    //<Nombre cliente 2>
    private int totalCashiers;
    private Stack<String> customersOnLine;

    public Cashier(int totalCashiers) {
        this.totalCashiers = totalCashiers;
    }

    public void addCashier() {
        totalCashiers++;
    }
    public void getCustomerOnLine(String person) {
        customersOnLine.push(person);
        System.out.println(person + " has entered the line");
    }

    public void attendCustomer() {
        String person = customersOnLine.pop();
        System.out.println(person + " has entered the line");
    }

    public String showCustomer() {
        String showedCustomers = "";

        for (int i = 0; i < customersOnLine.size(); i++) {
            showedCustomers += customersOnLine.get(i) + ", \n";
        }
        return showedCustomers;
    }
    public String ShowCashierInfo() {
        return "* Número de cajas: "+ totalCashiers+"\n" +
                "* Total de clientes: "+ customersOnLine.size() +"\n" +
                "* Clientes en la fila:\n"
                + "* " + showCustomer();
    }
}