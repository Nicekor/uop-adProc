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

    public CardboardBoxI(int quantity, double width, double length, double height, int grade, boolean sealableTop) {
        super(quantity, 0, width, length, height, grade, sealableTop);
    }

    @Override
    public double calculateTotalPrice() {
        double area = calculateArea();
        double pricePerM = calculatePricePerM();
        double totalPrice = area * pricePerM;
        if (sealableTop){
            double sealablePrice = totalPrice * selableTopPerc;
            totalPrice = totalPrice + sealablePrice;
        }
        return totalPrice * quantity;
    }

    @Override
    public String[] getAll() {
        String[] all = new String[9];
        all[0] = "0";
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
