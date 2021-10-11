package com.example.appminiproject;

public class Car {
    private String Name;
    private int Price;
    private String url;

    public Car(){
    }

    public Car(String Name, int Price, String url) {
        this.Name = Name;
        this.Price = Price;
        this.url = url;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

