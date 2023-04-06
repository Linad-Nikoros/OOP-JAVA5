package org.example.HomeWork5.model;
public class Drink extends Product{
    private Integer volume;
    public Drink(String name, Integer price, Integer volume) {
        super(name, price);
        this.volume = volume;
    }
}
