
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */

public class Calculator {
    
    private Reader reader = new Reader();
    private int calculationsCounter;
    
    public Calculator()
    {
        this.calculationsCounter = 0;
    }
    
    public void start()
    {
        while (true) 
        {
            System.out.println("command: ");
            String command = reader.readString();
            if (command.equals("end"))
            {
                break;
            }
            
            if (command.equals("sum"))
            {
                sum();
                calculationInc();
            }
            else if (command.equals("difference"))
            {
                difference();
                calculationInc();
            }
            else if (command.equals("product"))
            {
                product();
                calculationInc();
            }
            
        }
        
        statistics();
    }
    
    private void sum()
    {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int sum = value1 + value2;
        System.out.println("sum of the values " + sum);
    }
    
    private void difference()
    {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int difference = value1 - value2;
        System.out.println("difference of the values " + difference);
    }
    
    private void product()
    {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int product = value1 * value2;
        System.out.println("product of the values " + product);
    }
    
    private int calculationInc()
    {
        this.calculationsCounter += 1;
        return this.calculationsCounter;
    }
    
    private void statistics()
    {
        System.out.println("Calculations done " + this.calculationsCounter);
    }
}
