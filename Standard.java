import java.util.ArrayList;
/**
 * ACS-1904 Assignment 3
 * Name: Jaskarandeep Singh Jashan
 * Student Number: 3179009
 */
public class Standard extends Vehicle{
    // fields
    Option op;
    
    // private field
    private ArrayList<Option> options;
    
    // no arg constructor
    public Standard(){
        this.make = "unknown";
        this.model = "unknown";
        this.basePrice = 0;
        options = new ArrayList();
        
    }
    
    // full arg constructor
    public Standard(String make, String model, int basePrice){
        super(make, model, basePrice);
        options = new ArrayList();
        
    }
    
    // getters
    public ArrayList<Option> getOption(){
        return options;
        
    }
    
    // setters
    public void setOption(ArrayList<Option> options){
        this.options = options;
        
    }
    
    // utilities
    // add option add the options unless the size of list is less than
    // equals to 4 and then it checks if the list contains NONE or not,
    // and add the item to options arraylist if NONE is not there
    public void addOption(Option op){
        if(options.size() < 5){
            if(!options.contains(Option.NONE)){
                options.add(op);
                
            }
            
        }
                
    }
    
    public void displayOptions(){
        for(Option op: options){
            System.out.println(op);
            
        }
    }
    
    @Override
    public int calculatePrice(){
        int sum = 0;
        
        // loop runs through the options list and add the sum of
        // each option to the total sum
        for(Option op: options){
            sum += op.getPricePerDay();
            
        }
        
        return super.basePrice + sum;
    }
}