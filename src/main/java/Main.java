import Model.Flat;
import Model.Floor;
import Model.House;
import Model.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // setting up rooms (6)
        Room roomNr1 = new Room();
        roomNr1.setHeight(3.00);
        roomNr1.setLightOn(false);

        Room roomNr2 = new Room();
        roomNr2.setHeight(3.10);
        roomNr2.setLightOn(false);

        Room roomNr3 = new Room();
        roomNr3.setHeight(2.90);
        roomNr3.setLightOn(true);

        Room roomNr4 = new Room();
        roomNr4.setHeight(9.00);
        roomNr4.setLightOn(false);

        Room roomNr5 = new Room();
        roomNr5.setHeight(9.00);
        roomNr5.setLightOn(true);

        Room roomNr6 = new Room();
        roomNr6.setHeight(7.00);
        roomNr6.setLightOn(false);

        // setting up Flats
        Flat flatNr1 = new Flat();
        flatNr1.setArea(64.14);
        flatNr1.setNr(1);
        flatNr1.setOwner("Kostik");

        List<Room> roomsIn1 = new ArrayList<>();
        roomsIn1.add(roomNr1);
        roomsIn1.add(roomNr2);

        flatNr1.setRooms(roomsIn1);

        //---------------
        Flat flatNr2 = new Flat();
        flatNr2.setArea(34.14);
        flatNr2.setNr(2);
        flatNr2.setOwner("Kostik");

        List<Room> roomsIn2 = new ArrayList<>();
        roomsIn2.add(roomNr3);

        flatNr2.setRooms(roomsIn2);


        // setting up floors
        Floor floorNr1 = new Floor();
        floorNr1.setNr(1);

        List<Flat> flats = new ArrayList<>();
        flats.add(flatNr1);
        flats.add(flatNr2);

        floorNr1.setFlats(flats);

        // setting up house

        House house = new House();
        house.setNr(221);
        house.setStreetName("Baker str.");

        List<Floor> floors = new ArrayList<>();
        floors.add(floorNr1);
        floors.add(new Floor());

        house.setFloors(floors);

        System.out.println(house.getFloors().get(0).getFlats().get(0).getRooms().get(0).getHeight());
















//        String text = "No svētdienas, 28. jūnija, regulāros starptautiskos lidojumus no un uz lidostu Rīga atsāk Īrijas zemo cenu aviokompānija Ryanair, portālu Delfi informēja lidostas Komunikācijas vienības vadītāja Laura Kulakova.";
//
//        String[] words = text.split(" ");
//        System.out.println("Words count is " + words.length);
//        // pozvoljet vivesti 5 slovo System.out.println(words[4]);
//        for (int i = 0; i < words.length; i++) {
//            //esli napisatj  i=i+2 vmesto i++,to  vidast kazhdoe vtoroe slovo.
//            System.out.println(words[i]);
//
//        }
//        for (String word : words){
//            System.out.println(word);
//        }
//
//        List<String> names = new ArrayList<>();
//        names.add("Valera");
//        names.add("Kostik");
//        names.add("Max");
//        names.add("Doggo");
//
//        System.out.println(names.get(1));
//
//        for (String name  :names) {
//            System.out.println(name);
//        }
//
//        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
//        bookUniqueWords.put("the", 1);
//        bookUniqueWords.put("Student", 1);
//        bookUniqueWords.put("is", 1);
//        bookUniqueWords.put("the", 2);
//
//        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet())
//            System.out.println(entry.getKey());



    }
}

