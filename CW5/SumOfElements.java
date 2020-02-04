import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(6);
        arr.add(9);
        arr.add(1);
        arr.add(8);
        System.out.print("Enter k: ");
        int k = s.nextInt();
        Set set = new HashSet<Integer>();
        for(int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);
            if(set.contains(k-x)) {
                System.out.println(x + " + " + (k - x));
            }else{
                set.add(x);
            }
        }
    }
}