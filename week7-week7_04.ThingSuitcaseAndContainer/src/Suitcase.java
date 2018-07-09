
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class Suitcase {
    private int maximumWeightLimit;
    private ArrayList<Thing> things;
            
    //constructor
    public Suitcase(int maximumWeightLimit)
    {
        this.maximumWeightLimit = maximumWeightLimit;
        this.things = new ArrayList<Thing>();
    }
        
    public void addThing(Thing thing)
    {

        if (  (this.totalWeight() < this.maximumWeightLimit ) & ( this.totalWeight() + thing.getWeight() < this.maximumWeightLimit )) {
            this.things.add(thing);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Thing t : this.things) {
            weight += t.getWeight();
        }
        return weight;
    }
    
    
    public Thing heaviestThing()
    {
        if ( this.things.size() == 0 ) {
            return null;
        }
        
        Thing heaviest = null;
        
        for (Thing t : this.things)
        {
            if (heaviest == null || heaviest.getWeight() < t.getWeight())
            {
                heaviest = t;
            }
        }
        return heaviest;
    }

    public void printThings()
    {
        for (Thing t : this.things) 
        {
            System.out.println(t);
        }
    }
    
    public String toString()
    {
        if ( this.things.size() == 0 )
        {
            return "empty (0 kg)";
        }
        if ( this.things.size() == 1 )
            return "1 thing (" + this.totalWeight() + " kg)";
        return this.things.size() + " things (" + this.totalWeight() + " kg)";
    }
}
