import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "No svētdienas, 28. jūnija, regulāros starptautiskos lidojumus no un uz lidostu Rīga atsāk Īrijas zemo cenu aviokompānija Ryanair, portālu Delfi informēja lidostas Komunikācijas vienības vadītāja Laura Kulakova.";

        String[] words = text.split(" ");
        System.out.println("Words count is " + words.length);
        // pozvoljet vivesti 5 slovo System.out.println(words[4]);
        for (int i = 0; i < words.length; i++) {
            //esli napisatj  i=i+2 vmesto i++,to  vidast kazhdoe vtoroe slovo.
            System.out.println(words[i]);

        }
        for (String word : words){
            System.out.println(word);
        }

        List<String> names = new ArrayList<>();
        names.add("Valera");
        names.add("Kostik");
        names.add("Max");
        names.add("Doggo");

        System.out.println(names.get(1));

        for (String name  :names) {
            System.out.println(name);
        }

        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
        bookUniqueWords.put("the", 1);
        bookUniqueWords.put("Student", 1);
        bookUniqueWords.put("is", 1);
        bookUniqueWords.put("the", 2);

        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet())
            System.out.println(entry.getKey());



    }
}

