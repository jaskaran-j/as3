import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.util.ArrayList;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;

/**
 * ACS-1904 Assignment 3
 * Name: Jaskarandeep Singh Jashan
 * Student Number: 3179009
 */
public class As3CDriver{
    public static void main(String[] args) throws FileNotFoundException{
        // fields
        WeeklySpecial weeklySpecial = new WeeklySpecial("April 3");
        ArrayList<Vehicle> vehicles = new ArrayList();
        ArrayList<Vehicle> premium = new ArrayList();
        ArrayList<Vehicle> standard = new ArrayList();
        
        // reading data
        XMLDecoder de;
        try{
            de = new XMLDecoder(new FileInputStream("As3B-vehicles.xml"));
            
        }
        catch(FileNotFoundException e){
            de = null;
            JOptionPane.showMessageDialog(null, "File not Found");
            
        }
        
        // storing data that was read from xml files
        if(de!=null){
            premium = (ArrayList<Vehicle>) de.readObject();
            standard = (ArrayList<Vehicle>) de.readObject();
            de.close();
            
        }
        
        // adding premiums and standards to vehicles
        for(Vehicle p: premium){
            vehicles.add(p);
            
        }
        
        for(Vehicle s: standard){
            vehicles.add(s);
            
        }
        
        // adding vehicles to weeklyspecial that meet the conditions
        for(Vehicle v: vehicles){
            //System.out.println(v.getMake());
        
            if(v.getMake().equals("Ford") || v.getMake().equals("Lotus") || v.getMake().equals("Nissan")){
                weeklySpecial.addVehicle(v);
                
            }
            
        }
        
        // printing special information
        weeklySpecial.displaySpecialInfo();
        
        
        // writitng the data into xml file:
        XMLEncoder en = new XMLEncoder(new FileOutputStream("As3C-specialInfo.xml"));
        en.writeObject(weeklySpecial);
        en.close();
        
        System.out.println("Weekly special info written to file");
        
        // end of program
        System.out.println("end of program");
        
    }
}