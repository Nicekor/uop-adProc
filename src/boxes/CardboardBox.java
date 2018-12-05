/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.text.DecimalFormat;

/**
 *
 * @author up861808, up864461, up876126, up861332
 */
public abstract class CardboardBox {
    protected int grade, colourPrint, quantity;
    protected boolean reinforcedBottoms, reinforcedCorners, sealableTop;
    protected double width, length, height;
    private String boxTypeName;
    
    protected final double oneColourPerc = 0.12;
    protected final double twoColourPerc = 0.15;
    protected final double reinforcedBottomsPerc = 0.13;
    protected final double reinforcedCornersPerc = 0.12;
    protected final double selableTopPerc = 0.10;
    
    public CardboardBox(String boxTypeName, int quantity, int colourPrint, double width, double length, double height, int grade, boolean sealableTop){
        this.boxTypeName = boxTypeName;
        this.quantity = quantity;
        this.colourPrint = colourPrint;
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.sealableTop = sealableTop;
        
    }
    
    /**
     * This method is used to get the name of this box type
     *
     * @return The name of this box type
     */
    public String getBoxTypeName(){
        return boxTypeName;
    }
    
    /**
     * This method is used to calculate the area of this box
     *
     * @return The area in meters
     */
    protected double calculateArea(){
        DecimalFormat df = new DecimalFormat("#.##");
        double area = (2 * (height * width)) + (2 * (height * length)) + (2 * (width * length));
        area = Double.parseDouble(df.format(area));
        return area;
    }
    
    /**
     * This method is used to get the price per meter of this box
     *
     * @return The price per meter
     */
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
    
    /**
     * This method is used to get the total price of this box.
     *
     * @return The total price of this box
     */
    public abstract double calculateTotalPrice();
    
    /**
     * This method is used to get all the values as a String format.
     *
     * @return A string array of the values of this box. (0 = colour,
     * 2 = quantity, 3 = width, 4 = height, 5 = length, 6 = grade,
     * 7 = reinforcedBottom, 8 = reinforcedCorners, 9 = sealableTop
     */
    public String[] getAllStrings() {
        String[] all = new String[9];
        all[0] = String.valueOf(colourPrint);
        all[1] = String.valueOf(quantity);
        all[2] = String.valueOf(width);
        all[3] = String.valueOf(height);
        all[4] = String.valueOf(length);
        all[5] = String.valueOf(grade);
        all[6] = String.valueOf(reinforcedBottoms);
        all[7] = String.valueOf(reinforcedCorners);
        all[8] = String.valueOf(sealableTop);
        return all;
    }
}
