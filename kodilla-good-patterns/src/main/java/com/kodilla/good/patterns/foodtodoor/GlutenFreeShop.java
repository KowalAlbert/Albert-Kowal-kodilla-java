package com.kodilla.good.patterns.foodtodoor;

public class GlutenFreeShop implements Company {

    public boolean process(String item, int quantity) {
        if (quantity > 2) {
            return false;
        }
        return true;
    }
}
