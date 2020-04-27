import java.util.*; 
class Student {
    Scanner obj = new Scanner(System.in);
    String name;
    int Roll_no , marks []= new int[5] ;
    double average ;
    void get(){
        System.out.println("Name : ");
        name = obj.next();
        System.out.println("Roll No : ");
        Roll_no = obj.nextInt();
        System.out.println("Marks : ");
        for(int i = 0 ; i < 5 ; i++) {
            marks[i] = obj.nextInt();
        }
    }
    void display() {
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+Roll_no);
        System.out.println("Average : "+average);
    }
    void average() {
        int sum=0;
        for(int i = 0 ; i < 5 ; i++) {
            sum = sum + marks[i];
        }
        average = sum / 5;
    }
    public static void main(String  [] args) {
        Student q1 [] = new Student[2];
        Student q2 [] = new Student[2];
        Student q3 [] = new Student[2];
        Student q4 [] = new Student[2];
        
        for(int i = 0 ; i < 2 ; i++) {
            q1[i] = new Student();
            q1[i].get();
            q1[i].average();
            q1[i].display();
        }
        for(int i = 0 ; i < 2 ; i++) {
            q2[i] = new Student();
            q2[i].get();
            q2[i].average();
            q2[i].display();
        }
        for(int i = 0 ; i < 2 ; i++) {
            q3[i] = new Student();
            q3[i].get();
            q3[i].average();
            q3[i].display();
        }
        for(int i = 0 ; i < 2 ; i++) {
            q4[i] = new Student();
            q4[i].get();
            q4[i].average();
            q4[i].display();
        }
    }
}
