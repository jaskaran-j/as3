import java.util.ArrayList;

public class WeeklySpecial{
    private String date;
    private int code;
    private static int lastNumber = 1045;
    private ArrayList<Vehicle> specials; // make it type Special
    
    public WeeklySpecial(){
        this.date = "unknown";
        this.code = nextNumber();
        specials = new ArrayList();
        
    }
    
    // full arg constructor
    public WeeklySpecial(String date){
        this.date = date;
        this.code = nextNumber();
        specials = new ArrayList();
        
    }
    
    public String getDate(){
        return this.date;
        
    }
    
    public void setDate(String date){
        this.date = date;
        
    }
    
    public void displaySpecials(){
        for(Vehicle v: specials){
            System.out.println(v);
            
        }
        
    }
    
    public int getSpecialCode(){
        return this.code;
        
    }
    
    public void setSpecialCode(int code){
        this.code = code;
    }
    
    public void addVehicle(Vehicle v){
        v.setSpecialCode(nextNumber());
        specials.add(v);
        
    }
    
    public String displaySpecialInfo(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Date: " + this.date);
        sb.append("Special ID\t\tVehicle");
        
        for(Vehicle v: specials){
            sb.append(v.getSpecialCode() + "\t\t\t" + v.getMake() + " " + v.getModel());
            
        }
        
        return sb.toString();
        
    }
    
    public void printSpecials(){
        for(Vehicle v: specials){
            System.out.println(v);
        }
    }
    private int nextNumber(){
        return lastNumber++;
        
    }
    
}