package org.example.HomeWork5.service;
import org.example.HomeWork5.model.ChocolateBar;
import org.example.HomeWork5.model.Drink;
import org.example.HomeWork5.model.HotDrink;
import org.example.HomeWork5.model.Product;
import java.util.ArrayList;
public class Service {
    private Integer count = 0;
    public void outputSelectedCategoryProduct(Integer inputCategory, ArrayList<Product> listProduct) {
        switch (inputCategory) {
            case 1:
                for (Product p : listProduct) {
                    if (p instanceof Drink) {
                        count++;
                        System.out.println(count +". "+ p.toString());
                    }
                }
                break;

            case 2:
                for (Product p : listProduct) {
                    if (p instanceof HotDrink) {
                        count++;
                        System.out.println(count +". "+ p.toString());
                    }
                }
                break;

            case 3:
                for (Product p : listProduct) {
                    if (p instanceof ChocolateBar) {
                        count++;
                        System.out.println(count +". "+ p.toString());
                    }
                }
        }
    }
}
