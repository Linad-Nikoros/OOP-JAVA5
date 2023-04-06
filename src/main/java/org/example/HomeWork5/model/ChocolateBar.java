package org.example.HomeWork5.model;
public class ChocolateBar extends Product{
    private Integer weight;
    public ChocolateBar(String name, Integer price, Integer weight) {
        super(name, price);
        this.weight = weight;
    }
}
