package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        if (products == null) return;
        for (ProductForSale p : products) {
            if (p != null) {
                p.showDetails();
            }
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[] {
                new Chocolate("Dark", 3.5, "70% cocoa bar", 70),
                new Coke("Classic", 2.0, "Carbonated soft drink", 330),
                new Bread("Sourdough", 1.75, "Daily baked loaf", 600)
        };
        listProducts(products);
    }
}
