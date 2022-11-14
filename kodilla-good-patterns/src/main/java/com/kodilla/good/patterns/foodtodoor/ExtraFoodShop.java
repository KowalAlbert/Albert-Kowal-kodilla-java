package com.kodilla.good.patterns.foodtodoor;

public class ExtraFoodShop implements Company {

    public boolean process(String item, int quantity) {
        if (item.equals("Eggs")) {
            return true;
        }
        return false;
    }
}
