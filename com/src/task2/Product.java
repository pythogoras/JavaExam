package com.src.task2;



class Product {
    private String name;
    private int quantity;

    Product (String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {return this.name;}

    public int getQuantity() {return this.quantity;}
}
