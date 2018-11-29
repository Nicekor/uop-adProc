/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.text.DecimalFormat;

/**
 *
 * @author nicekor
 */
public abstract class CardboardBox {
    protected int grade, colourPrint, quantity;
    protected boolean reinforcedBottoms, reinforcedCorners, sealableTop;
    protected double width, length, height;
    
    protected final double oneColourPerc = 0.12;
    protected final double twoColourPerc = 0.15;
    protected final double reinforcedBottomsPerc = 0.13;
    protected final double reinforcedCornersPerc = 0.12;
    protected final double selableTopPerc = 0.10;
    
    public CardboardBox(int quantity, int colourPrint, double width, double length, double height, int grade, boolean sealableTop, boolean reinforcedBottoms, boolean reinforcedCorners){
        this.quantity = quantity;
        this.colourPrint = colourPrint;
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.reinforcedBottoms = reinforcedBottoms;
        this.reinforcedCorners = reinforcedCorners;
    }
    
    protected double calculateArea(){
        DecimalFormat df = new DecimalFormat("#.##");
        double area = (2 * (height * width)) + (2 * (height * length)) + (2 * (width * length));
        area = Double.parseDouble(df.format(area));
        return area;
    }
    
    protected double calculatePricePerM(){
        double price = 0;
        switch(grade){
            case 1:
                price = 0.55;
                break;
            case 2:
                price = 0.65;
                break;
            case 3:
                price = 0.82;
                break;
            case 4:
                price = 0.98;
                break;
            case 5:
                price = 1.5;
                break;
        }
        return price;
    }
    
    protected abstract double calculateTotalPrice();
}
