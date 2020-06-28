import java.util.*;

public class HomeWork1 {
    public static void main(String[] args) {
        long milliseconds = 10000000000000l;

        milliToHours(milliseconds);

        //task 2
        Map<String,String> contacts= new LinkedHashMap<>();
        contacts.put("Zhora", "2234456");
        contacts.put("Archibaljd", "2984698245");
        contacts.put("Zina", "224544676");
        contacts.put("Zhozefina", "22346456");
        contacts.put("Dzhon Buljon", "228780977");

        for (String contact : contacts.keySet()){
            printContact(contact, contacts.get(contact));
        }
    }

    public static void milliToHours(long milliseconds) {

        Long hours = milliseconds / 1000 / 60 / 60;
        System.out.println(hours + " Hours");

    }

    public static void printContact(String name, String phone){
        System.out.println("Contact name: " + name + " - Phone number: " + phone);
    }

}
