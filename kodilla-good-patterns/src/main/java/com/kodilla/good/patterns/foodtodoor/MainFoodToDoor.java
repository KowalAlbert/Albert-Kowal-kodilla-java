package com.kodilla.good.patterns.foodtodoor;

/*
 Uwagi od autora do zadania:
 - nie jest napisane od kogo pobieramy informacje o dostawie
 - "dalsza czesc wszedzie wyglada tak samo" to oznaczac bedzie, ze jest wiele podpunktow i wiele zamowien?
 - kto ma otrzymac potwierdzenie zrealizowania zamowienia?
*/

public class MainFoodToDoor {

    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        DeliveryList deliveryList = new DeliveryList();
        deliveryList.addDelivery(new Delivery("ExtraFoodShop", "Eggs", 12));
        deliveryList.addDelivery(new Delivery("GlutenFreeShop", "GlutenFreeBread", 1));
        deliveryList.addDelivery(new Delivery("HealthyShop", "Apples", 8));

        for (Delivery delivery: deliveryList.getShoppingCart()) {
            if (delivery.getCompany().equals("ExtraFoodShop")) {
                if (extraFoodShop.process(delivery.getItemName(), delivery.getItemQuantity())) {
                    System.out.println("Order accepted.");
                } else {
                    System.out.println("Order rejected.");
                }
            } else if (delivery.getCompany().equals("GlutenFreeShop")) {
                if (glutenFreeShop.process(delivery.getItemName(), delivery.getItemQuantity())) {
                    System.out.println("Order accepted.");
                } else {
                    System.out.println("Order rejected.");
                }
            } else if (delivery.getCompany().equals("HealthyShop")) {
                if (healthyShop.process(delivery.getItemName(), delivery.getItemQuantity())) {
                    System.out.println("Order accepted.");
                } else {
                    System.out.println("Order rejected.");
                }
            } else {
                System.out.println("Company not found.");
            }
        }
    }
}
