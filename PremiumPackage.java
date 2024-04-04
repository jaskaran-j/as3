/**
 * ACS-1904 Assignment 3
 * Name: Jaskarandeep Singh Jashan
 * Student Number: 3179009
 */

public enum PremiumPackage{
    // enum values
    NONE("None", 0),
    SPORT("Sport", 15),
    LUXURY("Luxury", 12),
    BUSINESS("Business",14);
    
    // private fields
    private String display;
    private int pricePerDay;
    
    // full arg constructor
    private PremiumPackage(String d, int p){
        display = d;
        pricePerDay = p;
        
    }
    
    // getters
    // getPricePerDay() method gets the price of the package per day
    public int getPricePerDay(){
        return this.pricePerDay;
        
    }
    
    public String getDisplay(){
        return this.display;
        
    }
}