import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class As3CDriver{
    public static void main(String[] args){
        WeeklySpecial weeklySpecial = new WeeklySpecial();
        ArrayList<Vehicle> vehicles = new ArrayList();
        
        XMLDecoder de;
        try{
            de = new XMLDecoder(new FileInputStream("As3B-vehicles.xml"));
            
        }
        catch(FileNotFoundException e){
            de = null;
            JOptionPane.showMessageDialog(null, "File not Found");
            
        }
        
        if(de!=null){
            vehicles = (ArrayList<Vehicle>) de.readObject();
            de.close();
            
        }
        
        for(Vehicle v: vehicles){
            System.out.println(v.getMake());
            if(v.getMake().equals("Ford") || v.getMake().equals("Lotus") || v.getMake().equals("Nissan")){
                weeklySpecial.addVehicle(v);
                
            }
            
        }
        
        weeklySpecial.printSpecials();
            
    }
}