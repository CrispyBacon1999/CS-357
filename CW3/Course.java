import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class Course implements Comparable, Cloneable {
    String name;
    int year;
    int studentCount;
    ArrayList<String> students;

    public Course() {
        this("", Calendar.getInstance().get(Calendar.YEAR));
    }

    public Course(String name, int year) {
        studentCount = 0;
        students = new ArrayList<String>();
        this.name = name;
        this.year = year;
    }

    public void addStudent(String name) {
        studentCount++;
        students.add(name);
    }

    public int compareTo(Object other) {
        Course o = (Course) other;
        int result = year - o.year;
        if (result == 0) {
            return this.name.toLowerCase().compareTo(o.name.toLowerCase());
        }
        return result;
    }

    public Object clone() {
        Course other = new Course();
        other.name = name;
        other.studentCount = 0;
        other.year = year;
        other.students = new ArrayList<String>();
        return other;
    }

    public String toString() {
        String studs = Arrays.toString(students.toArray());
        return String.format(
            "Course{name='%s', year=%d, enrolled=%d, sList=%s}",
            name, year, studentCount, studs
        );
    }
}