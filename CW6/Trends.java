import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Trends {
    static Map<String, Integer> hashtags;

    public static void main(String[] args) throws FileNotFoundException {
        hashtags = new HashMap<String, Integer>();
        Scanner s = new Scanner(new File("files/twitter_data.txt"));
        while (s.hasNext()) {
            String word = s.next();
            if (word.startsWith("#")) {
                String key = word.substring(1);
                try {
                    int count = hashtags.get(key);
                    hashtags.put(key, count + 1);
                } catch (NullPointerException e) {
                    hashtags.put(key, 1);
                }
            }
        }
        s.close();
        LinkedHashMap<String, Integer> sorted = hashtags.entrySet().stream().sorted(Entry.comparingByValue())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        Object[] keys = sorted.keySet().toArray();
        for (int i = keys.length - 1; i > keys.length - 6; i--) {
            System.out.println(keys[i] + " : " + sorted.get(keys[i]));
        }
    }
}