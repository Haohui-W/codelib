package com.github.haohuiw.homework.homework04;

public class Test {
    public static void main(String[] args) {
        User user = new User("王浩辉", 99);
        Product[] products = new Product[6];
        for (int i = 0; i < 2; i++) {
            products[i] = new Product("方便面", 5.5);
        }
        for (int i = 2; i <= 5; i++) {
            products[i] = new Product("火腿肠", 2.2);
        }
        Order order = new Order(user, products);
        System.out.printf("%.1f\n", calcBalance(order));
    }

    public static double calcBalance(Order order) {
        for (Product product : order.getProducts()) {
            order.getUser().setBalance(order.getUser().getBalance() - product.getPrize());
        }
        return order.getUser().getBalance();
    }
}
