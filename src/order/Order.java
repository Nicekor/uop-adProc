/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order;

import boxes.CardboardBox;
import java.util.ArrayList;

/**
 *
 * @author up861808, up864461, up876126, up861332
 */
public class Order {

    private ArrayList<CardboardBox> boxes;

    public Order() {
        boxes = new ArrayList<CardboardBox>();
    }
    
    /**
     * This method is used to add boxes to this order.
     *
     * @param box The box to add to this order.
     */
    public void addBox(CardboardBox box) {
        boxes.add(box);
    }

    /**
     * This method is used to get the total price of the order.
     *
     * @return The total price of the order as a double.
     */
    public double calculateTotalPrice() {
        double price = 0.0;
        for (CardboardBox cardboardBox : boxes) {
            price = price + cardboardBox.calculateTotalPrice();
        }
        return price;
    }

    /**
     * This method is used to remove boxes from this order.
     *
     * @param index The index of the item to remove.
     */
    public void removeBox(int index) {
        if (boxes.isEmpty()) {
            return;
        }
        if (index < 0 || index >= boxes.size()) {
            return;
        }
        boxes.remove(index);
    }

    /**
     * This method is used to clear the order
     */
    public void clear() {
        boxes.clear();
    }

    /**
     * This method is used to get all the boxes currently in the order
     *
     * @return An array of all the boxes.
     */
    public ArrayList<CardboardBox> getBoxes() {
        return boxes;
    }
}
