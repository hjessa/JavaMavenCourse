package Part8;

import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vR;

    public VehicleRegistry(){
        vR = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(!vR.containsKey(licensePlate)){
            vR.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        if(vR.get(licensePlate) != null){
            return vR.get(licensePlate);
        }

        return null;
    }

    public boolean remove(LicensePlate licensePlate){
        if (vR.containsKey(licensePlate)) {
            vR.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates(){
        for (LicensePlate licensePlate : vR.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners(){
        for (String value : vR.values()) {
            System.out.println(value);
        }
    }
}
