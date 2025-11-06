package org.example.model;

public class Chocolate extends ProductForSale {
    private final int cocoaPercentage;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaPercentage = 0;
    }

    public Chocolate(String type, double price, String description, int cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() { return cocoaPercentage; }

    @Override
    public void showDetails() {
        System.out.println("Chocolate -> type: " + getType() + ", price: " + getPrice() +
                ", description: " + getDescription() + ", cocoa%: " + cocoaPercentage);
    }
}
