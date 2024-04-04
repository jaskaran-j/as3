/**
 * ACS-1904 Assignment 3
 * Name: Jaskarandeep Singh Jashan
 * Student Number: 3179009
 */
public class Premium extends Vehicle{
    // fields
    private PremiumPackage pack;
    
    // no arg
    public Premium(){
        this.make = "unknown";
        this.model = "unknown";
        this.basePrice = 0;
        
    }
    
    // full arg
    public Premium(String make, String model, int basePrice, PremiumPackage pack){
        super(make, model, basePrice);
        this.pack = pack;
        
    }
    
    // getters
    public PremiumPackage getPack(){
        return this.pack;
        
    }
    
    // setters
    public void setPack(PremiumPackage pack){
        this.pack = pack;
        
    }
    
    @Override
    public int calculatePrice(){
        return super.basePrice + this.pack.getPricePerDay();
        
    }
}