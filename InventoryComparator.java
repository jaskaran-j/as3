import java.util.Comparator;
/**
 * ACS-1904 Assignment 3
 * Name: Jaskarandeep Singh Jashan
 * Student Number: 3179009
 */
public class InventoryComparator implements Comparator<Vehicle>{
    public int compare(Vehicle v1, Vehicle v2){
        if(v1.calculatePrice() > v2.calculatePrice()){
            return -1;
        }
        else if(v1.calculatePrice() < v2.calculatePrice()){
            return 1;
        }
        else{
            return 0;
        }
        
    }
    
}