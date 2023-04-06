package org.example.HomeWork5.model;
import java.util.ArrayList;
import java.util.List;
public class ListProduct {
   private static ArrayList<Product> listProducts = new ArrayList<>(List.of(
            new Drink("water",15,600),
            new HotDrink("coffee",50,75,350),
            new ChocolateBar("mars",80,150),
            new ChocolateBar("bounty",75,150),
            new Drink("green tea",50,300)));
   public static ArrayList getListProducts() {
        return listProducts;
    }
}
