package ru.netology.domain;

public class TShirt extends Product {
    private String size;

    public TShirt() {
    }

    public TShirt(int id, String name, int cost, String size) {
        super(id, name, cost);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
