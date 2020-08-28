package model;

import java.util.List;

public class CarHelper {
    public Auto getAutoById(String id, List<Auto> autos){
        for (Auto auto : autos) {
            if (auto.getNumber(). equals(id)){
                return auto;
            }
        }

        return null;
    }
}
