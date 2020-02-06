import java.util.*;

public class RunwayTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = s.nextInt();
        Runway r = new Runway(k);
        while(true) {
            System.out.print("Time: ");
            int t = s.nextInt();
            boolean added = r.addToSchedule(t);
            if (added) {
                System.out.println("✓");
            } else {
                System.out.println("X");
            }
        }
    }
}

class Runway {
    TreeSet<Integer> schedule;
    int boundary;
    public Runway(int boundary) {
        this.boundary = boundary;
        schedule = new TreeSet<Integer>();
    }

    public boolean addToSchedule(int time) {
        SortedSet<Integer> s = schedule.subSet(time - boundary, time + boundary);
        if(s.size() == 0){
            schedule.add(time);
            return true;
        } else {
            return false;
        }
    }
}