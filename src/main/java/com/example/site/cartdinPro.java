package com.example.site;

public class cartdinPro {
    String price;
    int ID,Quantity;
    String name, description;
    String image;
    public cartdinPro(String name,String price, String description, int ID,int Quantity) {
        this.price = price;
        this.ID=ID;
        this.name = name;
        this.description = description;
        this.Quantity=Quantity;
    }
    public int getQuantity(){return Quantity;
    }
    public int getID(){return ID;}
    public String getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }




}
