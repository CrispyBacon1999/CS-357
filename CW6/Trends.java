import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Trends {
    static TreeMap<String, Integer> hashtags;
    
    public static void main(String[] args) throws FileNotFoundException {
        hashtags = new TreeMap<String, Integer>();
        Scanner s = new Scanner(new File("files/twitter_data.txt"));
        while(s.hasNext()) {
            String word = s.next();
            System.out.println(word);
            if(word.startsWith("#")) {
                String key = word.substring(1);
                try {
                    int count = hashtags.get(key);
                    hashtags.put(key, count + 1);
                } catch(NullPointerException e) {
                    hashtags.put(key, 1);
                }
            }
        }
        s.close();
        System.out.println(hashtags);
        NavigableMap temp = hashtags.descendingMap();
        int i = 0;
        for(Map.Entry<String, Integer> x : temp.entrySet()) {
            System.out.println(String.format("%s : %d", x.getKey(), x.getValue()));
            i++;
            if(i > 5) {
                break;
            }
        } 
    }
}