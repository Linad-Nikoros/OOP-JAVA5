package org.example.HomeWork5.model;
public  abstract class Product {
    private String name;
    private Integer price;
    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public Integer getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Название  = '" + name + '\'' +
                ", Цена = " + price + "рублей";
    }
}
