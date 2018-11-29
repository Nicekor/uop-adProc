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
public class CardboardBoxII extends CardboardBox{

    public CardboardBoxII(int quantity, double width, double length, double height, int grade, boolean sealableTop) {
        super(quantity, 1, width, length, height, grade, sealableTop);
    }

    @Override
    protected double calculateTotalPrice() {
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

    @Override
    protected String[] getAll() {
        String[] all = new String[9];
        all[0] = "1";
        all[1] = String.valueOf(quantity);
        all[2] = String.valueOf(width);
        all[3] = String.valueOf(height);
        all[4] = String.valueOf(length);
        all[5] = String.valueOf(grade);
        all[6] = "false";
        all[7] = "false";
        all[8] = String.valueOf(sealableTop);
        return all;
    }
    
}
