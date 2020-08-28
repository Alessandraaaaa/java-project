package model;

import java.util.ArrayList;
import java.util.List;

public class CarRental {
    public static void main (String[] args){
        List<Auto> autos = new ArrayList<>();

        autos.add(new Auto("LM-1234","VW","Polo","1986","13.00"));
        autos.add((new Auto("LK-17","BMW","X8","1700","10.00"));
        autos.add(new Auto("Hacker","pepe","ogonj","1989","0.00"));

        Client hacker = new Client("Hacker","hackerovic","null@null.lv","7868776");
        Client lana = new Client("Lana","Brezhneva","tuc@tuc.lv","87645872439");

        CarHelper helper = new CarHelper();
        helper.getAutoById("Hacker", helper.getFreeAutos(autos)).rent(hacker);



    }
    // polu4aem konkretnoe avto po id (tozhe saoe ,4to nomer)
    private Auto getAutoById(String id, List<Auto> autos){
        for (Auto auto : autos) {
            if (auto.getNumber(). equals(id)){
                return auto;
            }
        }

        return null;
    }

    public List<Auto> getFreeAutos(List<Auto> autos){
        List<Auto> freeAutos = new ArrayList<>();

        for (Auto auto:autos) {
            if (auto.getClient()==  null){
                freeAutos.add(auto);
            }

        }

        return freeAutos;
    }
}
