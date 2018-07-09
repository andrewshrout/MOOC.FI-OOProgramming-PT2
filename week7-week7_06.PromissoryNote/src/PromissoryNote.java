
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
public class PromissoryNote {
    private HashMap<String, Double> debt;
    
    public PromissoryNote()
    {
        this.debt = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value)
    {
        this.debt.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whoseDebt)
    {
        if (this.debt.containsKey(whoseDebt)){
            return this.debt.get(whoseDebt);
        }
        return 0;
    }
}
