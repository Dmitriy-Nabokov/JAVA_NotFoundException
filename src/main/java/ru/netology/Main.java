package ru.netology;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        try {
            repo.removeById(-100);
//            System.out.println("Nice");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ass");

        }
    }
}