
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
public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister()
    {
        this.owners = new HashMap<RegistrationPlate, String>();

    }
    
    public boolean add(RegistrationPlate plate, String owner)
    {
        if (!owners.containsKey(plate))
                {
                    return true;
                }
        return false;
    }
    
    public String get(RegistrationPlate plate)
    {
            if (owners.containsKey(plate))
            {
                return owners.get(plate);
            }
            return null;
    }
    
    public boolean delete(RegistrationPlate plate)
    {
        if (owners.containsKey(plate))
        {
            owners.remove(plate);
            return true;
        }
        return false;
    }
}
