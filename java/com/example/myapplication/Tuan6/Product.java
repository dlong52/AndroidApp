package com.example.myapplication.Tuan6;

public class Product {
    private String styleId;
    private String brand;
    private String price;
    private String addittionalInfo;
    private String searchImage;

    public Product() {
    }

    public Product(String styleId, String brand, String price, String addittionalInfo, String searchImage) {
        this.styleId = styleId;
        this.brand = brand;
        this.price = price;
        this.addittionalInfo = addittionalInfo;
        this.searchImage = searchImage;
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddittionalInfo() {
        return addittionalInfo;
    }

    public void setAddittionalInfo(String addittionalInfo) {
        this.addittionalInfo = addittionalInfo;
    }

    public String getSearchImage() {
        return searchImage;
    }

    public void setSearchImage(String searchImage) {
        this.searchImage = searchImage;
    }
}
