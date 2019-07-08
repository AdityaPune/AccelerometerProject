package com.shebin.ecommerce;

public class Product {
    private String name;
    private String category;
    private int price;
    private int pic;

    public Product(String name, String category, int price, int pic) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public int getPic() {
        return pic;
    }
}
