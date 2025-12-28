package com.molier.store;

public class Pen implements Items{
    private String itemName;
    private double price;
    Pen(String name, double price){
        itemName = name;
        this.price = price;
    }
    @Override
    public String getItemName() {

        // TODO Auto-generated method stub
        return itemName;
    }

    @Override
    public double getPrice(){
        return price;
    }
}
