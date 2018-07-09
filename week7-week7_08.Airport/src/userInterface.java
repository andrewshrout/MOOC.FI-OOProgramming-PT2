
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
public class userInterface {
    //TODO: scanner object
    Airport airport;
    Scanner scan = new Scanner(System.in);

    
    userInterface()
    {
        this.airport = new Airport();
    }
    
 
    void airportPanel()
    {
        System.out.println("Airport panel\n--------------------\n");

        while (true)
        {
            //prints options
            System.out.println("Choose operation:\n[1] Add airplane\n[2] Add flight\n[x] Exit");
            String input = scan.next();

            if ( input.equalsIgnoreCase("1"))
            {
                this.addAirplane();
            }

            if ( input.equalsIgnoreCase("2"))
            {
                this.addFlight();
            }

            if ( input.equalsIgnoreCase("x"))
            {
                break;
            }
        }
        
        //PART 2: FLIGHT SERVICE
        
        System.out.println("Flight service\n------------\n");
        while (true)
        {
            System.out.println("Choose operation:\n[1] Print planes\n[2] Print flights\n[3] Print plane info\n[x] Quit");

            String input = scan.next().trim();
            //TODO: call print planes
            
            if ( input.equalsIgnoreCase("1"))
            {
                this.printAllPlanes();
            }
            
            //TODO: print flights
            
            if ( input.equalsIgnoreCase("2"))
            {
                this.printAllFlights();
            }
            
            //TODO: print plane info by ID
            
            if ( input.equalsIgnoreCase("3"))
            {
                System.out.println("Give plane ID:");
                String planeID = scan.next();
                System.out.println(this.airport.getPlane(planeID));
            }
            
            //TODO: quit
            if ( input.equalsIgnoreCase("x"))
            {
                break;
            }
        }
        
    }

    
    //Adds airplane to hanger hashmap
    public void addAirplane()
    {
        System.out.println("Give plane ID:");
        String inputID = scan.next();
        System.out.println("Give plane capacity:");
        int planeCapacity = scan.nextInt();
        Airplane newAirplane = new Airplane(inputID, planeCapacity);
        this.airport.addPlane(inputID, newAirplane );
    }
    
    //Adds flight to flightList hashmap
    
    public void addFlight()
    {        
        System.out.println("Give plane ID:");
        String planeID = scan.next();
        System.out.println("Give departure airport code:");
        String departureCode = scan.next();
        System.out.println("Give destination airport code:");
        String destinationCode = scan.next();
        this.airport.addFlight(planeID, departureCode, destinationCode);
    }

    
    public void printAllPlanes()
    {
        this.airport.printPlanes();
    }
    
    
    public void printAllFlights()
    {
        this.airport.printAllFlights();
    }

}
