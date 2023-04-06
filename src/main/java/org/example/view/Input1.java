package org.example.view;

import java.util.Scanner;

public class Input1 {
     public String MessageCredit(){
        System.out.println("Вам одобрен кредит.Если хотите его взять введите 1");
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();
        return inputUser;
    }



}
