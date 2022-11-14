package com.kodilla.good.patterns.foodtodoor;

import java.util.ArrayList;
import java.util.List;

public class DeliveryList {
    private List<Delivery> shoppingCart = new ArrayList<>();

    public void addDelivery (Delivery delivery) {
        shoppingCart.add(delivery);
    }

    public boolean removeDelivery (Delivery delivery) {
        if (shoppingCart.contains(delivery)) {
            shoppingCart.remove(delivery);
            return true;
        }
        return false;
    }

    public List<Delivery> getShoppingCart() {
        return shoppingCart;
    }
}
