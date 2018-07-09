
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class Airplane{
    
    private int capacity;
    private String ID;
    
    Airplane(String id, int capacity)
    {
        this.ID = id;
        this.capacity = capacity;
    }
     
    public String getID()
    {
        return this.ID;
    }
    
    public int getCapacity()
    {
        return this.capacity;
    }
    
/*    void getAllFlights()
    {
        //prints out all flights for a plane
        for(String departureKey: this.flightsTaken.keySet() )
        {
            System.out.println( this.getID() + " (" + this.getCapacity() + " ppl) (" + departureKey + "-" + flightsTaken.get(departureKey) + ")");
        }
    }
*/    
    public String toString()
    {
        return ( this.getID() + " (" + this.getCapacity() + " ppl)");
    }
    
}
