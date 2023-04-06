package org.example.HomeWork5.view;
import java.util.Scanner;

public class View {
   public void Greeting(){
        System.out.println("Добро пожаловать в торговый атомат.");
    }
   public void ViewCategoryProduct(){
        System.out.println("Выберите категорию товаров\n" +
                "В наличии следущие категории товаров:"  +
                "\n1.Напитки" +
                "\n2.Горячие напитки" +
                "\n3.Шоколодные батончки");
    }
    public Integer selectCategoryProduct(){
        Scanner scanner = new Scanner(System.in);
        Integer inputCategory = scanner.nextInt();
        return inputCategory;
    }
}
