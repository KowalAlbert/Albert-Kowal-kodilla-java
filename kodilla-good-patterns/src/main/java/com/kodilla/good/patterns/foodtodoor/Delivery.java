package com.kodilla.good.patterns.foodtodoor;

public class Delivery {
    private String company;
    private String itemName;
    private int itemQuantity;

    public Delivery(String company, String itemName, int itemQuantity) {
        this.company = company;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    public String getCompany() {
        return company;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
}
