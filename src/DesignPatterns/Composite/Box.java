package DesignPatterns.Composite;

import java.util.List;

public class Box {

    private List<Box> boxes;
    private List<Product> products;

    public Box() {
    }

    public Box(List<Box> boxes, List<Product> products) {
        this.boxes = boxes;
        this.products = products;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
