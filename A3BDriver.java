
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class A3BDriver extends InventoryComparator{
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList();
        ArrayList<Premium> premiums = new ArrayList();
        ArrayList<Standard> standards = new ArrayList();
        
        XMLDecoder de;
        try{
            de = new XMLDecoder(new FileInputStream("As3-vehicles.xml"));
            
        }
        catch(FileNotFoundException e){
            de = null;
            JOptionPane.showMessageDialog(null, "File not Found");
            
        }
        
        if(de != null){
            vehicles = (ArrayList<Vehicle>) de.readObject();
            de.close();
        }
        
        for(Vehicle v: vehicles){
            if(v instanceof Premium){
                premiums.add((Premium) v);
                
            }
            else if(v instanceof Standard){
                standards.add((Standard) v);
                
            }
            
        }
        
        //sorting 
        Collections.sort(premiums, new InventoryComparator());
        Collections.sort(standards, new InventoryComparator());
        
        System.out.println("Premium Vehicles by Price:\n");
        for(Vehicle p: premiums){
            System.out.println(p.displayVehicleInfo() + ": $" + p.calculatePrice());
        }
        
        System.out.println("\nStandard Vehicles by Price:\n");
        for(Vehicle s: standards){
            System.out.println(s.displayVehicleInfo() + ": $" + s.calculatePrice());
            
        }
        
        System.out.println("\n***********************************************");
        System.out.println("\nWriting premiums and standards to xml file");
        
        XMLEncoder en;
        try{
            en = new XMLEncoder(new FileOutputStream("As3B-vehicles.xml"));
            
        }
        catch(FileNotFoundException e){
            en = null;
            JOptionPane.showMessageDialog(null, "File cannot be accessed");
            
        }
        
        if(en!=null){
            en.writeObject(premiums);
            en.writeObject(standards);
            en.close();
            System.out.println("\n*** Registration info has been written to As3B-vehicles.xml ***");
            
        }
        System.out.println("end of program");
    }
}