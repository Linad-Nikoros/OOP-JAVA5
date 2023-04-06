package org.example.HomeWork5;
import org.example.HomeWork5.controller.Controller;
import org.example.HomeWork5.service.Service;
import org.example.HomeWork5.view.View;
public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        View view = new View();
        Controller controller = new Controller(view,service);
        controller.execute();
    }
}