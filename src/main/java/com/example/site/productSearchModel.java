package com.example.site;

public class productSearchModel {
    String price,ID,image;
    String name, description,pagePath;
    public productSearchModel(String name,String price, String description, String ID, String image,String pagePath) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.image = image;
        this.pagePath = pagePath;
    }

    public String getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public String getID() {
        return ID;
    }
    public String getImage() {
        return image;
    }
    public String getPagePath() {
        return pagePath;
    }

}
