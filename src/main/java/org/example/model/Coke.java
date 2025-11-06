package org.example.model;

public class Coke extends ProductForSale {
    private final int volumeMl;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volumeMl = 0;
    }

    public Coke(String type, double price, String description, int volumeMl) {
        super(type, price, description);
        this.volumeMl = volumeMl;
    }

    public int getVolumeMl() { return volumeMl; }

    @Override
    public void showDetails() {
        System.out.println("Coke -> type: " + getType() + ", price: " + getPrice() +
                ", description: " + getDescription() + ", volume(ml): " + volumeMl);
    }
}
