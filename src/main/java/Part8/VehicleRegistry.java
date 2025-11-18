package Part8;

import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vR;

    public VehicleRegistry(){
        vR = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(vR.get(licensePlate) == null){
            vR.replace(licensePlate,owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        if(vR.get(licensePlate) != null){
            return vR.get(licensePlate);
        }
    }

    public boolean remove(LicensePlate licensePlate){

    }
}
