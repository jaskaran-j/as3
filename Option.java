
/**
 * ACS-1904 Assignment 3
 * Name: Jaskarandeep Singh Jashan
 * Student Number: 3179009
 */

public enum Option{
    // enum values
    NONE("None", 0),
    SATNAV("Satnav", 5),
    BLUETOOTH("Bluetooth",7),
    KEYLESS("Keyless Entry", 4),
    ROADSIDE("Roadside Assistance", 7);
    
    // private fields
    private String display;
    private int pricePerDay;
    
    // full arg
    private Option(String d, int p){
        display = d;
        pricePerDay = p;
        
    }
    
    // getPricePerDay return the rate of the option per day
    public int getPricePerDay(){
        return this.pricePerDay;
    }
}