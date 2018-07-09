

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */

// THIS ENDED UP NOT USED

public class Flight {
    
    private String depature;
    private String destination;


    Flight(String departure, String destination)
    {
        this.depature = departure;
        this.destination = destination;
    }

    public String getDeparture()
    {
        return this.depature;
    }
    
    public String getDestination()
    {
        return this.destination;
    }
    
    public String toString()
    {
        return ( "("+ this.getDeparture() + "-" + this.getDestination() + ")" );
    }
    
}

