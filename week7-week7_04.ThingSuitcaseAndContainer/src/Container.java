
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
public class Container {
    private int maximumWeightLimit;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maximumWeightLimit)
    {
        this.maximumWeightLimit = maximumWeightLimit;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase)
    {
        if ((this.totalWeight() + suitcase.totalWeight()) <= this.maximumWeightLimit )
        {
            this.suitcases.add(suitcase);            
        }

    }
    
    public int totalWeight()
    {
        int weight = 0;
        for (Suitcase suitcase : suitcases)
        {
            weight += suitcase.totalWeight();
        }
        return weight;
    }
    
    
    public String toString()
    {
        return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printThings()
    {
        for (Suitcase suitcase : suitcases) 
        {
            suitcase.printThings();
        }
    }
    
}
