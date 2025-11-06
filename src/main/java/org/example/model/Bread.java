package org.example.model;

public class Bread extends ProductForSale {
    private final int weightGr;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.weightGr = 0;
    }

    public Bread(String type, double price, String description, int weightGr) {
        super(type, price, description);
        this.weightGr = weightGr;
    }

    public int getWeightGr() { return weightGr; }

    @Override
    public void showDetails() {
        System.out.println("Bread -> type: " + getType() + ", price: " + getPrice() +
                ", description: " + getDescription() + ", weight(g): " + weightGr);
    }
}
