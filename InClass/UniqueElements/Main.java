import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("files/bigFile.txt"));

        int count = 0;
        int data[] = new int[10000000];
        try {

            while (s.hasNext()) {
                data[count] = s.nextInt();
                count++;
            }
        } finally {
            s.close();
        }

        boolean[] unique = new boolean[100];
        for (int i = 0; i < count; i++) {
            boolean found = false;
            int a = data[i];
            found = unique[a - 1];
            unique[a - 1] = true;
            if (!found) {
                System.out.println(a);
            }
        }
    }
}