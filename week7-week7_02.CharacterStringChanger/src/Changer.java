
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
public class Changer {
    private ArrayList<Change> changes;    
    
    public Changer()
    {
        this.changes = new ArrayList<Change>();

    }
    
    public void addChange(Change change)
    {
        //adds new change to the changer
        this.changes.add(change);
    }
    
    public String change(String characterString)
    {
        String word = characterString;
        //executes all added Changes for the string in order of their adding, then returns the string
        for (Change Change : this.changes)
        {
            System.out.println(word);
            word = Change.change(word);
        }
        return word;
    }
}
