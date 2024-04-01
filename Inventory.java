import java.util.ArrayList;
import java.util.Collections;

public class Inventory{
    // private fields
    private String name;
    private ArrayList<Vehicle> vehicles;
    
    // no arg constructor
    public Inventory(){
        this.name = "unknown";
        vehicles = new ArrayList();
        
    }
    
    // full arg constrcutor
    public Inventory(String name){
        this.name = name;
        vehicles = new ArrayList();
        
    }
    
    // getters 
    public String getInventoryName(){
        return this.name;
        
    }
    
    public ArrayList<Vehicle> getVehicles(){
        return vehicles;
        
    }
    
    // extras
    public void addVehicle(Vehicle v){
        // adding vechile int the arrayList
        vehicles.add(v);
        
        // setting the inventory for the vehicle
        v.setInventory(this);
        
        // sorting the arrayList
        Collections.sort(vehicles);
        
    }
    
    public String displayVehicleList(){
        StringBuilder sb = new StringBuilder();
        
        for(Vehicle v: vehicles){
            sb.append(v.displayVehicleInfo() + " $" + v.calculatePrice() + "\n");
            
        }
        
        return sb.toString();
        
    }
    
}