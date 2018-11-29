/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author nicekor
 */
public class CardboardBoxI extends CardboardBox{

    public CardboardBoxI(int quantity, int colourPrint, double width, double length, double height, int grade, boolean sealableTop, boolean reinforcedBottoms, boolean reinforcedCorners) {
        super(quantity, 0, width, length, height, grade, sealableTop, false, false);
    }

    @Override
    protected double calculateTotalPrice() {
        double area = calculateArea();
        double pricePerM = calculatePricePerM();
        double totalPrice = area * pricePerM;
        if (sealableTop){
            double sealablePrice = totalPrice * selableTopPerc;
            totalPrice = totalPrice + sealablePrice;
        }
        return totalPrice;
    }

    
    
}
