/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author up861808, up864461, up876126, up861332
 */
public class CardboardBoxII extends CardboardBox{

    public CardboardBoxII(int quantity, double width, double length, double height, int grade, boolean sealableTop) {
        super("II", quantity, 1, width, length, height, grade, sealableTop);
    }

    @Override
    public double calculateTotalPrice() {
        double area = calculateArea();
        double pricePerM = calculatePricePerM();
        
        double priceWithoutExtras = area * pricePerM;
        double extras = priceWithoutExtras * oneColourPerc;
        
        double totalPrice = priceWithoutExtras + extras;
        if (sealableTop){
            double sealablePrice = totalPrice * selableTopPerc;
            totalPrice = totalPrice + sealablePrice;
        }
        return totalPrice * quantity;
    }
}
