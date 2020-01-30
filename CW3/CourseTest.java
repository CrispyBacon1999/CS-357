import java.util.Arrays;

public class CourseTest {
    public static void main(String args[]){
        Course c1 = new Course ("CIS357",2019);
        c1.addStudent("A");
        c1.addStudent("B");
        c1.addStudent("C");

        System.out.println(c1); // Printing c1

        Course c2 = (Course) c1.clone(); //copying c1 into c2
        //adding new students to c2
        c2.addStudent("C");
        c2.addStudent("D");
        c2.addStudent("E");
        c2.addStudent("F");

        System.out.println(c1);
        System.out.println(c2);

        Course cList[]= {
                new Course("CS216",2018),
                new Course("CS116",2018),
                new Course("CIS357",2018),
                new Course("CS216",2019),
                new Course("CS216",2020),
                new Course("CS401",2019),

        };

        Arrays.sort(cList);
        for (int i=0;i<cList.length;i++)
            System.out.println(cList[i].year+" "+cList[i].name);



    }


}
