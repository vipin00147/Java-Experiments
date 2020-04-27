import java.util.*;
interface One {
    Scanner obj = new Scanner(System.in);
    void NR();    
}
interface Two extends One{
    void M(); 
}
class Three implements One,Two {
    String course,name,Univ;
    int roll,Total_marks;
    public void CU() {
        System.out.println("Course : ");
        course = obj.next();
        System.out.println("university/Board: ");
        Univ = obj.next();
    }
    
    public void NR() {
        System.out.println("Name");
        name = obj.next();
        System.out.println("Roll No : ");
        roll = obj.nextInt();
    }

    public void M() {
        System.out.println("Total Marks : ");
        Total_marks = obj.nextInt();
    }
}
class Four extends Three {
    public static void main(String []args) {
        Four q1 = new Four();
        q1.CU();
        q1.NR();
        q1.M();
        System.out.println("Name : "+q1.name);
        System.out.println("Roll No : "+q1.roll);
        System.out.println("Total Marks : "+q1.Total_marks);
        System.out.println("Course : "+q1.course);
        System.out.println("university/Board: "+q1.Univ);
    } 
}
