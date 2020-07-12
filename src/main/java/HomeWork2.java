import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HomeWork2 {
    public static void main(String[] args) {
        String text = "The Girl with the Dragon Tattoo is a 2011 psychological crime thriller film based on the 2005 novel by Swedish writer Stieg Larsson. It was directed by David Fincher with a screenplay by Steven Zaillian. Starring Daniel Craig as journalist Mikael Blomkvist and Rooney Mara as Lisbeth Salander, it tells the story of Blomkvist's investigation to find out what happened to a woman from a wealthy family who disappeared 40 years prior. He recruits the help of Salander, a computer hacker.";

        wordCount("Unique count is ", text);

        text = text.toLowerCase();
        wordCount("All words in lowercase count is ", text);

        text = text.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println("Text without special characters \n" + text);
    }

    private static void wordCount(String message, String text) {
        String[] words = text.split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(words));
        set.remove("");
        System.out.println(message + set.size());
    }


}
