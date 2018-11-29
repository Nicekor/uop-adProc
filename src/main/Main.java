/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import order.Order;
import ui.GUI;

/**
 *
 * @author nicekor
 */
public class Main {
    
    private static Order checkout;
    
    public static void main(String[] args) {
        checkout = new Order();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    public static Order getCheckOut() {
        return checkout;
    }
}
