
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
public class Dictionary {
    
    private HashMap<String, String> dictionary = new HashMap<String, String>();
    
    public String translate(String word)
    {
        return this.dictionary.get(word);
    }
    
    public void add(String word, String translation)
    {
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords()
    {
        return this.dictionary.size();
    }
    
    public ArrayList<String> translationList()
    {
        ArrayList<String> wordPairs = new ArrayList<String>();
        for ( String key : this.dictionary.keySet() )
        {
            wordPairs.add(key + " = " + this.translate(key));
        }
        return wordPairs;
    }
}
