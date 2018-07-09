
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
public class Airport {
    
    private Airplane airplane;
    private HashMap<String, Airplane> hanger = new HashMap<String, Airplane>();
    private HashMap<String, Airplane> flightList = new HashMap<String,Airplane>();

    
    
    //TODO: constructor
    Airport()
    {
        this.hanger = hanger;
        this.flightList = new HashMap<String,Airplane>();

    }
    
    void addPlane(String planeID, Airplane airplane)
    {
        this.hanger.put(planeID, airplane);
    }
    
    
    public void addFlight(String planeID, String departure, String arrival)
    {
        Airplane planeReference = this.getPlane(planeID);
        String flightConcat = "(" + departure + "-" + arrival + ")";
        this.flightList.put(flightConcat, planeReference);
    }
        
    
    //TODO: plane iterator by calling each plane in the hanger to String
    void printPlanes()
    {
        for (String planeID : this.hanger.keySet() )
        {
            System.out.println(this.getPlane(planeID));
        }
    }
    
    Airplane getPlane(String planeID)
    {
        if (this.hanger.containsKey(planeID))
        {
        return this.hanger.get(planeID);
        }
        return null;
    }
    
    //TODO: print all flights
    void printAllFlights()
    {
        for (String flight : this.flightList.keySet())
        {
            System.out.println( this.flightList.get(flight) + " " + flight);
        }
    }

    

}
