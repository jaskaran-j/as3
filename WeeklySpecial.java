 import java.util.ArrayList;
/**
 * ACS-1904 Assignment 3
 * Name: Jaskarandeep Singh Jashan
 * Student Number: 3179009
 */
public class WeeklySpecial{
    private String date;
    private static int lastNumber = 1045;
    private ArrayList<Special> specials;
    
    public WeeklySpecial(){
        this.date = "unknown";
        specials = new ArrayList();
        
    } 
    
    // full arg constructor
    public WeeklySpecial(String date){
        this.date = date;
        specials = new ArrayList();
        
    }
    
    // getters
    public String getDate(){
        return this.date;
        
    }
    
    public ArrayList<Special> getSpecials(){
        return this.specials;
        
    }
    
    // setters
    public void setDate(String date){
        this.date = date;
        
    }
    
    public void setSpecials(ArrayList<Special> specials){
        this.specials = specials;
        
    }
    
    // utilities
    public void addVehicle(Vehicle v){
        v.setSpecialCode(nextNumber());
        specials.add(v);
        
    }
    
    private int nextNumber(){
        return lastNumber++;
        
    }
    
    public void displaySpecialInfo(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Date: " + this.date + "\n");
        
        sb.append("Special ID\tVehicle\n");
        
        for(Special v: specials){
            sb.append(v.getSpecialCode() + "\t\t" + v.getVehicleInfo() + "\n");
            
        }
        
        System.out.println(sb.toString());
        
    }
    
    
}