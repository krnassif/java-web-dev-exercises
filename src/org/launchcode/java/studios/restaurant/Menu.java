package org.launchcode.java.studios.restaurant;

public class Menu {
private String mealCategories;
private String description;
private double price;
private boolean isNew;


public Menu (String mealCategories,String description,double price,boolean isNew) {
        this.mealCategories = mealCategories;
        this.description = description;
        this.price = price;
        this.isNew = isNew;
}
    public String getMealCategories() {
        return this.mealCategories;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean getIsNew(){
        return this.isNew;
    }

    public void setMealCategories(String appetizers) {
        mealCategories = appetizers;
    }

    public void setDescription(String wings) {
        description = "wings";
    }

    public void setPrice(double wingPrice) {
        price = 3.99;
    }
}

