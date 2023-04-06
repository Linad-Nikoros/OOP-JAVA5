package org.example.HomeWork5.controller;
import org.example.HomeWork5.model.ListProduct;
import org.example.HomeWork5.service.Service;
import org.example.HomeWork5.view.View;
public class Controller {
    private  View view;
    private  Service service;
    public Controller(View view, Service service) {
        this.view = view;
        this.service = service;
    }
    public  void execute(){
        view.Greeting();
        view.ViewCategoryProduct();
        Integer inputCategory = view.selectCategoryProduct();
        service.outputSelectedCategoryProduct(inputCategory,ListProduct.getListProducts());

    }

}
