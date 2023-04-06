package org.example.HomeWork5.model;
public class HotDrink extends Product{
    private Integer temperature;
    private Integer volume;
    public HotDrink(String name, Integer price, Integer temperature, Integer volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }
}
