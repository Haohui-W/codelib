package com.github.haohuiW.experiment.experiment02.ex7191;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        for (int i = 0; i < 10; i++) {
            market.getProducts()[i] = new Product();
        }
        market.setName("家乐福");
        market.getProducts()[0].setName("电视机");
        market.getProducts()[1].setName("洗衣机");
        market.getProducts()[2].setName("豆浆机");
        market.getProducts()[3].setName("打印机");
        Market market1 = new Market();
        for (int i = 0; i < 10; i++) {
            market1.getProducts()[i] = new Product();
        }
        market1.setName("家家乐福");
        market1.getProducts()[0].setName("电视机");
        market1.getProducts()[1].setName("洗衣机");
        market1.getProducts()[2].setName("豆浆机");
        market1.getProducts()[3].setName("打印机");

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        person.setName("张乐");
        String str = scanner.next();
        if (str.equals(market.getName())) {
            person.shopping(market, scanner.next());
        } else if (str.equals(market1.getName())) {
            person.shopping(market1, scanner.next());
        }
    }
}

class Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Market {
    private String name;
    private Product[] products = new Product[10];

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sell(String productName) {
        for (Product product : products) {
            if (product == null) {
                break;
            }
            if (productName.equals(product.getName())) {
                return productName;
            }
        }
        return null;
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shopping(Market market, String productName) {
        if (market.sell(productName) != null) {
            System.out.println(name + "买到了" + productName);
        } else {
            System.out.println(name + "所需商品无货");
        }
    }
}
