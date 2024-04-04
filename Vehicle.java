
/**
 * ACS-1904 Assignment 3
 * Name: Jaskarandeep Singh Jashan
 * Student Number: 3179009
 */

public abstract class Vehicle implements Comparable<Vehicle>, Special{
    // protected fields:
    protected String make;
    protected String model;
    protected String id;
    protected int basePrice;
    
    // static id
    private static int idSize = 1045;
    
    // A3C driver fields:
    private int specialCode;
    
    // extras
    Inventory inventory;
    
    public Vehicle(){
        this.make = "unknown";
        this.model = "unknown";
        this.basePrice = 0;
        
        int numPart = generateID();
        String stringPart = this.make.substring(0,2) + this.model.substring(0,2);
        
        this.id = stringPart + "-" + numPart;
        
    }
    
    public Vehicle(String make, String model, int basePrice){
        this.make = make;
        this.model = model;
        this.basePrice = basePrice;
        
        int numPart = generateID();
        String stringPart = this.make.substring(0,2) + this.model.substring(0,2);
        
        this.id = stringPart + "-" + numPart;
        
    }
    
    // getters:
    public String getMake(){
        return this.make;
        
    }
    
    public String getModel(){
        return this.model;
        
    }
    
    public String getID(){
        return this.id;
        
    }
    
    public int getBasePrice(){
        return this.basePrice;
        
    }
    
    public Inventory getInventory(){
        return this.inventory;
        
    }
    
    // setters
    public void setMake(String make){
        this.make = make;
        
    }
    
    public void setModel(String model){
        this.model = model;
        
    }
    
    public void setBasePrice(int basePrice){
        this.basePrice = basePrice;
        
    }
    
    public void setID(String id){
        this.id = id;
        
    }
    
    public void setInventory(Inventory i){
        this.inventory = i;
        
    }
    
    // getters for As3C Driver
    public String getVehicleInfo(){
        return this.make + " " + this.model;
        
    }
    
    public int getSpecialCode(){
        return this.specialCode;
        
    }
    
    // setters for As3C Drive
    public void setSpecialCode(int specialCode){
        this.specialCode = specialCode;
        
    }
    
    // method to generate id
    private int generateID(){
        return idSize++;
        
    }
    
    // comparable
    public int compareTo(Vehicle v){
        return this.id.compareTo(v.getID());
        
    }
    
    // abstract calculatePrice
    public abstract int calculatePrice();
    
    // extras
    public String displayVehicleInfo(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.make);
        sb.append(" ");
        sb.append(this.model);
        sb.append(": ");
        sb.append(this.id);
        
        return sb.toString();
        
    }
    
    // overridden toString
    @Override
    public String toString(){
        return this.make + ", " + this.model;
        
    }
}