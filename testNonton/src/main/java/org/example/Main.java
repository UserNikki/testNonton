package org.example;

public class Main {
    public static void main(String[] args) {
        ProductsImpl product = new ProductsImpl();
        Product burger = new Product("1","Burger");
        Product shaurma = new Product("2","Shaurma");
        Product pizza = new Product("3","Pizza");
        Product coffee = new Product("4","Coffee");
        Product hamburger = new Product("5","Burger");
        product.addProduct(burger);
        product.addProduct(shaurma);
        product.addProduct(pizza);
        product.addProduct(coffee);
        product.addProduct(hamburger);
        product.toConsole();
        product.deleteProduct(shaurma);
        System.out.println(product.deleteProduct(new Product("123456","name")));
        product.toConsole();
        System.out.println(product.getName("2"));//пустая строка
        System.out.println(product.getName("3"));
        System.out.println(product.findByName("Burger"));
        System.out.println(product.findByName("qwerty"));//пустой список
        System.out.println(product.addProduct(new Product("5","chicken")));//существующий айди
    }
}