package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

public class MenuItem {
    public static void main(String[] args) {
        Menu wings = new Menu("Appetizer", "wings", 3.99, false);
        Menu bread = new Menu("Appetizer", "bread", 5.99, false);
        Menu pasta = new Menu("Entree", "pasta", 9.99, false);
        Menu steak = new Menu("Entree", "steak", 15.99, true);
        Menu tiramisu = new Menu("Dessert", "tiramisu", 7.99, false);
        Menu gelato = new Menu("Dessert", "gelato", 6.99, false);

        System.out.println(wings.getMealCategories());

        ArrayList<String> mealCategories = new ArrayList<>();
        ArrayList<String> description = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Boolean> isNew = new ArrayList<>();

    }

}
