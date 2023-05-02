package com.utils.randomGenerator;

public class RandomGenerator {
    //2. Desarrolla una clase con un método estático que retorne un producto aleatorio. El
    //array de productos disponibles estará en un atributo privado y estático, y tendrá, al
    //menos, un total de doce productos.
    //3. Añade también un método estático que retorne un nombre de persona aleatorio. El
    //array de nombres disponibles estará en un atributo privado y estático, y tendrá, al
    //menos, un total de veinte nombres.

    private static String product[] = {
            "Malta", "Frescolita", "Chicha", "Arepas congeladas",
            "Hayacas", "Empanadas de mechada", "Cheezwiz", "Diablitos",
            "Golden (uva)", "Golden (manzana)", "Dorada SIN con limon", "Pasticho"
    };

    public static String RandomProduct() {

        String someProduct = product[(int)(Math.random() * 12)];

        return someProduct;
    }

    private static String people[] = {
            "Nicanor", "Daniel", "Gabriel", "Iker","Nalbert", "Diego", "Carlos", "Laura",
            "Juan", "Mario", "Pedro", "Ramón", "Luis", "Carmen", "Rodrigo", "Tania",
            "Aday", "Diana", "Miguel", "Michael",
    };

    public static String RandomPerson() {

        String somePerson = people[(int)(Math.random() * 20)];

        return somePerson;
    }
}
